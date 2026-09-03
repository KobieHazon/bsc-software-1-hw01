#!/usr/bin/env python3
"""Run CLI regression checks for Assignment1."""

from __future__ import annotations

import subprocess
import sys
from pathlib import Path


CASES = [
    (("3", "4", "5"), "The input (3,4,5) defines a valid triangle!\n", 0),
    (("5", "12", "13"), "The input (5,12,13) defines a valid triangle!\n", 0),
    (("1", "2", "3"), "The input (1,2,3) does not define a valid triangle!\n", 0),
    (("-1", "2", "3"), "Invalid input!\n", 0),
    (("3", "4"), "Invalid input!\n", 0),
    (("3", "four", "5"), "Invalid input!\n", 0),
]


def main() -> int:
    if len(sys.argv) != 2:
        print("usage: run_cli_tests.py BUILD_DIR", file=sys.stderr)
        return 2

    build_dir = Path(sys.argv[1]).resolve()
    failures: list[str] = []
    for arguments, expected_stdout, expected_returncode in CASES:
        result = subprocess.run(
            ["java", "-cp", str(build_dir), "Assignment1", *arguments],
            check=False,
            capture_output=True,
            text=True,
        )
        if result.returncode != expected_returncode or result.stdout != expected_stdout:
            failures.append(" ".join(arguments))
            print(f"case {' '.join(arguments)} failed", file=sys.stderr)
            print(f"stdout: {result.stdout!r}", file=sys.stderr)
            print(f"stderr: {result.stderr!r}", file=sys.stderr)

    if failures:
        print(f"failing cases: {failures}", file=sys.stderr)
        return 1
    return 0


if __name__ == "__main__":
    raise SystemExit(main())

# Software 1 - Homework 1

A 2018 CS BSc Java assignment submission for a command-line numeric validation exercise. The implementation reads three command-line integers and checks whether the first two values satisfy `x^2 + y^2 == z^2` with the third value.

## Behavior

- Prints `Invalid input!` when any argument is negative.
- Prints that the input defines a valid triangle when the first two values and third value form the Pythagorean relation.
- Prints that the input does not define a valid triangle otherwise.
- The maintained version also handles missing and non-integer command-line arguments as invalid input.

## Build

```bash
make
```

This compiles `src/Assignment1.java` into `build/` using `javac -Xlint:all -Werror`.

## Usage

```bash
java -cp build Assignment1 3 4 5
```

The command prints:

```text
The input (3,4,5) defines a valid triangle!
```

## Testing

```bash
make test
```

The regression tests cover valid triples, invalid triples, negative input, missing arguments, and non-integer input.

## Repository Structure

- `solution/written-answers.pdf`: my written answers
- `src/Assignment1.java`: my Java implementation, maintained for current toolchains
- `tests/run_cli_tests.py`: maintained command-line regression tests

JAVAC ?= javac
JAVA ?= java
PYTHON ?= python3

BUILD_DIR := build
MAIN_CLASS := Assignment1

.PHONY: all test clean

all: $(BUILD_DIR)/$(MAIN_CLASS).class

$(BUILD_DIR):
	mkdir -p $(BUILD_DIR)

$(BUILD_DIR)/$(MAIN_CLASS).class: src/$(MAIN_CLASS).java | $(BUILD_DIR)
	$(JAVAC) -Xlint:all -Werror -d $(BUILD_DIR) $<

test: all
	$(PYTHON) tests/run_cli_tests.py $(BUILD_DIR)

clean:
	rm -rf $(BUILD_DIR)

# Selenium Java TestNG Framework

Starter automation framework using Selenium WebDriver, TestNG, Maven, and the Page Object Model.

## Structure

- `src/main/java/base`: shared page functionality
- `src/main/java/pages`: page objects
- `src/main/java/utils`: config, driver, waits, and screenshots
- `src/test/java/base`: shared test setup and teardown
- `src/test/java/tests`: sample test classes
- `src/test/java/listeners`: TestNG listener for failure screenshots
- `src/test/resources`: runtime config and test data

## Run

```bash
mvn clean test
```

## Notes

- Default test site: `https://www.saucedemo.com`
- Browser can be changed in `src/test/resources/config.properties`

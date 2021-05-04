# cucumber-demo

POC for cucumber 6.x. This sample project implements cucumber tests following two different approaches. The approaches differ where the
tests are placed into:

* `src/main` _(cucumber-in-src-main submodule)_
* `src/test` _(cucumber-in-src-test submodule)_

### How to run

The project can be run via gradle:

* `gradlew :cucumber-in-src-main:bootRun -Dcucumber.filter.tags="not @WIP"`
* `gradlew :cucumber-in-src-test:test -Dcucumber.filter.tags="not @WIP"`

Alternatively each scenario / feature file can be triggered with IntelliJ's cucumber runner plugin.

### Spring integration into cucumber

In addition, the POC addresses the resolution of integrating spring into cucumber step files.

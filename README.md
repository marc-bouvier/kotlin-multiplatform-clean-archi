# Kotlin multiplatform code reuse

[![Gradle Build](https://github.com/marc-bouvier/kotlin-multiplatform-clean-archi/actions/workflows/gradle-publish.yml/badge.svg)](https://github.com/marc-bouvier/kotlin-multiplatform-clean-archi/actions/workflows/gradle-publish.yml)

- [shared-domain](shared-domain/README.md) : common domain logic & orchestration
    - can generate reusable for jvm & js targets
    - unit tests are run against various targets (jvm, js : multiple browsers)
- [js-browser-app](js-browser-app/README.md) : browser application based on shared domain
- [jvm-cli-app](jvm-cli-app/README.md) : jvm CLI app based on shared domain

## To-do

- [ ] Compile to Wasm and consume from
  - C#
  - Js
  - Rust
  - Swift


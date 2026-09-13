# Touchline 26 — Native Android 7

Se añade una capa nativa en Kotlin + Jetpack Compose con:
- modelos Club/Player
- motor de partido
- motor de temporadas
- motor de cantera/newgens
- pantalla nativa Compose
- workflow de GitHub Actions para generar un APK debug

La versión jugable completa incluida sigue disponible dentro de `app/src/main/assets/www/`
como respaldo mientras se termina de portar cada pantalla al stack nativo.

## Base de datos
La base incluida es una semilla/demo y no es la base propietaria de Football Manager.
Para una base mundial actualizada hacen falta datos propios, públicos o debidamente licenciados.

## APK
Con Android Studio/Gradle:
`./gradlew assembleDebug`

El APK queda en:
`app/build/outputs/apk/debug/`

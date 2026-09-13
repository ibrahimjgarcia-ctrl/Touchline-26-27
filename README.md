# Touchline 26 Android 6.1

Proyecto Android Studio que empaqueta la versión portable de Touchline 26 dentro de un WebView.

## Qué contiene
- Touchline26 completo como `app/src/main/assets/www/index.html`.
- WebViewAssetLoader para servir los assets con `https://appassets.androidplatform.net/...`.
- Guardado de partida mediante localStorage.
- Base de datos semilla incluida en el juego.
- `database_schema.json` para ampliar la base de datos con una fuente legal/verificada.

## Compilar
Abrir esta carpeta en Android Studio y ejecutar:
- Build > Build APK(s), o
- Build > Generate Signed Bundle / APK para una distribución firmada.

El APK de debug quedará normalmente en `app/build/outputs/apk/debug/`.

## Base de datos
No se ha copiado una base de datos propietaria de Football Manager. La aplicación usa datos semilla propios y el esquema preparado permite importar una base de datos que tengas derecho a utilizar. Para una base mundial real, incorpora una fuente con licencia o un archivo legalmente suministrado.

## Nota
Este entorno no tiene instalado el SDK/Gradle de Android, por lo que aquí no puedo producir un APK firmado directamente. El proyecto sí está estructurado para abrirlo en Android Studio y compilarlo.

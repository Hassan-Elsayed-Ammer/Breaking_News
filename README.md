# Breaking_News 
Android News Application (News-Dot-Com)

### Description
Android News Application, Based on News Api that Collects Articles And news From news Websites
user Can follow the latest news And show it From the source of publishing it Based On his County (Local), 
user Can Search in news About Specific news And he can share it Also and save that Article on His Device By Using SQLite - Room

# Technology used
## I tried to make a simple app as an application on the latest technology that is in Android until now

## By using
* Kotlin
* MVVM
* Retrofit2
* Coroutines
* Room

## Libraries
```bash
apply plugin: 'kotlin-android-extensions'
apply plugin: "androidx.navigation.safeargs.kotlin"

```
```bash
implementation 'androidx.appcompat:appcompat:1.1.0-alpha05'
```    
```bash  
    // Architectural Components
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0"

    // Room
    implementation "androidx.room:room-runtime:2.2.5"
    kapt "androidx.room:room-compiler:2.2.5"

    // Kotlin Extensions and Coroutines support for Room
    implementation "androidx.room:room-ktx:2.2.5"

    // Coroutines
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.5'
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.5'

    // Coroutine Lifecycle Scopes
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0"
    implementation "androidx.lifecycle:lifecycle-runtime-ktx:2.2.0"
```

```bash
    // Retrofit
    implementation 'com.squareup.retrofit2:retrofit:2.6.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.6.0'
    implementation "com.squareup.okhttp3:logging-interceptor:4.5.0"
```

```bash
    // Navigation Components
    implementation "androidx.navigation:navigation-fragment-ktx:2.2.1"
    implementation "androidx.navigation:navigation-ui-ktx:2.2.1"
```

```bash
   //BottomNavigationViewEx
 implementation 'com.github.ittianyu:BottomNavigationViewEx:2.0.4'
 
   //Glide
    implementation 'com.github.bumptech.glide:glide:4.11.0'
    kapt 'com.github.bumptech.glide:compiler:4.11.0'
```

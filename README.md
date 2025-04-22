# Android GIF Drawable Library

This Android library provides GIF support using the [android-gif-drawable](https://github.com/koral--/android-gif-drawable) library.

## Features

- Android library module that can be included in other Android projects
- Provides GIF rendering capabilities
- Includes data binding support

## Installation

To use this library in your Android project:

1. Add the JitPack repository to your root build.gradle:
```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

2. Add the dependency to your app's build.gradle:
```groovy
dependencies {
    implementation 'com.github.anil098421:TestingLibrary:1.0'
}
```

## Usage

Once you've added the library dependency, you can use it in your Android project.

```kotlin
// Example code to load a GIF
import pl.droidsonroids.gif.GifImageView

// In your layout XML
// <pl.droidsonroids.gif.GifImageView
//    android:id="@+id/gifView"
//    android:layout_width="match_parent"
//    android:layout_height="match_parent"
//    android:src="@drawable/your_gif" />

// In your Activity or Fragment
val gifImageView = findViewById<GifImageView>(R.id.gifView)
```

## License

This library is licensed under the MIT License. 
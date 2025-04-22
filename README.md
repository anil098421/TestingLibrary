# Android GIF Drawable Library

A wrapper library for the popular [android-gif-drawable](https://github.com/koral--/android-gif-drawable) that provides GIF support for Android applications.

## Features

- Display GIF animations in your Android application
- Support for various GIF formats
- Easy integration with Android projects

## Installation

Add the JitPack repository to your build file. Add it in your root build.gradle at the end of repositories:

```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Or in settings.gradle.kts (for newer projects):

```kotlin
dependencyResolutionManagement {
    repositories {
        ...
        maven { url = uri("https://jitpack.io") }
    }
}
```

Add the dependency:

```gradle
dependencies {
    implementation 'com.github.anil098421:MyDemoLibrary:v1.0.2'
}
```

Or in Kotlin DSL:

```kotlin
dependencies {
    implementation("com.github.anil098421:MyDemoLibrary:v1.0.2")
}
```

## Usage

Once you've added the dependency, you can use GifImageView in your layouts:

```xml
<pl.droidsonroids.gif.GifImageView
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:src="@drawable/your_gif_file" />
```

Or programmatically:

```kotlin
val gifImageView = GifImageView(this)
gifImageView.setImageResource(R.drawable.your_gif_file)
```

## License

This library is a wrapper around the android-gif-drawable library, which is distributed under the MIT License. 
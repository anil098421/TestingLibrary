# Android GIF Library

This is an Android library that provides GIF support using the android-gif-drawable library.

## How to Use This Library

### 1. Add the library to your project

#### Using JitPack (Recommended)

Add JitPack repository to your root build.gradle.kts or settings.gradle.kts:

```kotlin
// In settings.gradle.kts
dependencyResolutionManagement {
    repositories {
        // ... your existing repositories
        maven { url = uri("https://jitpack.io") }
    }
}
```

Add the dependency to your app's build.gradle.kts:

```kotlin
dependencies {
    implementation("com.github.anil098421:MyNewLibrary:1.0.0") 
}
```

#### For local development

```kotlin
// In settings.gradle.kts
include(":your-app")
include(":path-to-this-library") // For local development
```

```kotlin
// In your app's build.gradle.kts
dependencies {
    implementation(project(":path-to-this-library"))
}
```

### 2. Use GIF drawables in your application

```kotlin
import pl.droidsonroids.gif.GifImageView

// In your XML layout
// <pl.droidsonroids.gif.GifImageView
//    android:id="@+id/gifView"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:src="@drawable/your_gif" />

// In your Activity/Fragment
val gifImageView = findViewById<GifImageView>(R.id.gifView)
// Additional configuration as needed
```

## Publishing

### To JitPack

1. Push your changes to GitHub
2. Create a release tag on GitHub
3. JitPack will automatically build the library when you access https://jitpack.io/#anil098421/MyNewLibrary

### To Local Maven Repository

```
./gradlew publishToMavenLocal
```

This will make the library available in your local Maven repository. 
This will make the library available in your local Maven repository. 
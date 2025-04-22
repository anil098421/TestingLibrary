# Android GIF Library

This is an Android library that provides GIF support using the android-gif-drawable library.

## How to Use This Library

### 1. Add the library to your project

#### In your settings.gradle.kts file:

```kotlin
dependencyResolutionManagement {
    repositories {
        // ... your existing repositories
        maven { url = uri("path/to/this/library/maven-repo") }
    }
}

include(":your-app")
include(":path-to-this-library") // For local development
```

#### In your app's build.gradle.kts file:

```kotlin
dependencies {
    // For published version
    implementation("com.example.myapplication:app:1.0.0") 
    
    // OR for local development
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

To publish this library locally:

```
./gradlew publishToMavenLocal
```

This will make the library available in your local Maven repository. 
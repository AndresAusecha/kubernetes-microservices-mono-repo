plugins {
	kotlin("jvm") version "1.9.25"
	kotlin("plugin.spring") version "1.9.25"
	id("org.springframework.boot") version "3.4.5"
	id("io.spring.dependency-management") version "1.1.7"
	kotlin("plugin.jpa") version "1.9.25"
	kotlin("plugin.serialization") version "2.1.20"
}

group = "com.users"
version = "0.0.1"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.postgresql:postgresql:42.7.5")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")

	implementation("io.ktor:ktor-client-core:2.3.10") // Use the latest version
	implementation("io.ktor:ktor-client-cio:2.3.10") // For non-Android JVM environments
	implementation("io.ktor:ktor-client-okhttp:2.3.10") // For Android
	implementation("io.ktor:ktor-client-content-negotiation:2.3.10")
	implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.10")
	implementation ("io.github.microutils:kotlin-logging-jvm:2.0.11")
	implementation("com.fasterxml.jackson.core:jackson-core:2.19.0")
	implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.0")


	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
	compilerOptions {
		freeCompilerArgs.addAll("-Xjsr305=strict")
	}
}

allOpen {
	annotation("jakarta.persistence.Entity")
	annotation("jakarta.persistence.MappedSuperclass")
	annotation("jakarta.persistence.Embeddable")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

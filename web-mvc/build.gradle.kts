plugins {
    id("spring-conventions")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation(project(":common"))
}
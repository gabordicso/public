package test

import io.micronaut.http.annotation.Get

open class TestBaseService<T: TestBaseObject>
constructor() {
    lateinit var obj: T

    @Get(uri = "testMethodOnlyInBase")
    fun testMethodOnlyInBase(): T {
        return obj
    }

    @Get(uri = "testMethodToOverride_NoAnnotationInChildService")
    open fun testMethodToOverride_NoAnnotationInChildService(): T {
        return obj
    }

    @Get(uri = "TestBaseService-testMethodToOverride")
    open fun testMethodToOverride(): T {
        return obj
    }
}

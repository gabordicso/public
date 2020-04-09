package test

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/api/v1/test")
class TestChildService: TestBaseService<TestChildObject>() {
    override fun testMethodToOverride_NoAnnotationInChildService() = super.testMethodToOverride_NoAnnotationInChildService()
    @Get(uri = "TestChildService-testMethodToOverride")
    override fun testMethodToOverride() = super.testMethodToOverride()
}
package eu.testfx.api

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.CONSTRUCTOR)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class Api(val apiState: ApiState)

enum class ApiState {
    INTERNAL,
    INCUBATING,
    PUBLIC,
    DEPRECATED,
}

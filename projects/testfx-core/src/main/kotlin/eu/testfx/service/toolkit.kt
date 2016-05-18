package eu.testfx.service

import eu.testfx.api.Api
import eu.testfx.api.ApiState.INTERNAL
import javafx.application.Application
import javafx.stage.Stage
import javafx.stage.StageStyle
import java.util.concurrent.CompletableFuture

@Api(INTERNAL)
class PrimaryStageApplication : Application() {
    val primaryStageFuture = PrimaryStageFuture()

    override fun start(primaryStage: Stage) {
        primaryStage.initStyle(StageStyle.UNDECORATED)
        primaryStage.title = javaClass.simpleName
        primaryStageFuture.complete(primaryStage)
    }
}

@Api(INTERNAL)
class PrimaryStageFuture : CompletableFuture<Stage>()

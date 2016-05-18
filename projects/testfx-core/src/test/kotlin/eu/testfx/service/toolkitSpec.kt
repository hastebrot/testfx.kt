package eu.testfx.service

import com.nhaarman.mockito_kotlin.mock
import com.winterbe.expekt.expect
import io.damo.kspec.Spec
import javafx.stage.Stage

class PrimaryStageApplicationSpec : Spec({

    describe("PrimaryStageApplication") {
        val stage = mock<Stage>()
        val application = PrimaryStageApplication()
        application.start(stage)

        test("primaryStageFuture.get()") {
            expect(application.primaryStageFuture.get()).to.equal(stage)
        }
    }

})

package offerlinks.jpk.lss.adminapi.domain.model

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "処理結果")
enum class ResponseType {
    OK, NG
}

package offerlinks.jpk.lss.adminapi.presentation.dto.plandelete

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.NotNull
import offerlinks.jpk.lss.adminapi.presentation.dto.ResponseResult
import java.time.LocalDateTime

@Schema(description = "プラン情報削除応答")
data class PlanDeleteResponseDto(
    @get:Schema(
        description = "IFの実行結果を設定する要素",
        required = true
    )
    val result: ResponseResult

)
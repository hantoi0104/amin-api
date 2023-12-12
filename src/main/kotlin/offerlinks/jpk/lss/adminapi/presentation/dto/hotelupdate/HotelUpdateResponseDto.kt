package offerlinks.jpk.lss.adminapi.presentation.dto.hotelupdate

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import offerlinks.jpk.lss.adminapi.presentation.dto.ResponseResult
import java.time.LocalDateTime
import java.util.UUID

data class HotelUpdateResponseDto(

    @get:Schema(
        description = "IFの実行結果を設定する要素",
        required = true
    )
    val result: ResponseResult,

    @get:Schema(
        description = "最終更新日時",
        required = true
    )
    val updatedDatetime: LocalDateTime?
)

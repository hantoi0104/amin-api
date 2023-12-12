package offerlinks.jpk.lss.adminapi.presentation.dto.hotelupdate

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import java.time.LocalDateTime
import java.util.UUID

@Schema(description = "ホテル情報更新リクエスト")
data class HotelUpdateRequestDto (

    @get:Schema(
        description = "ホテルID",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    val hotelId: UUID?,

    @get:Schema(
        description = "ホテル名(英語)",
        required = true,
        maxLength = 200
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 200)
    @field:Pattern(
        regexp = "(^[A-Za-z]+\$)",
        message = "アルファベットの文字で入力してください。"
    )
    val hotelNameEn: String?,

    @get:Schema(
        description = "ホテル名",
        required = true,
        maxLength = 200
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 200)
    val hotelName: String?,

    @get:Schema(
        description = "都市",
        required = true,
        minLength = 3,
        maxLength = 3
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(min = 3, max = 3)
    @field:Pattern(
        regexp = "(^[A-Za-z]+\$)",
        message = "アルファベットの文字で入力してください。"
    )
    val cityCode: String?,

    @get:Schema(
        description = "ホテルコード",
        required = true,
        maxLength = 80
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 80)
    val hotelCode: String?,

    @get:Schema(
        description = "連絡先",
        required = true,
        maxLength = 20
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 20)
    val contact: String?,

    @get:Schema(
        description = "連絡先2",
        required = true,
        maxLength = 20
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 20)
    val contact2: String?,

    @get:Schema(
        description = "グレード<br>\n" +
            "\"S\"：S<br>\n" +
            "\"A\"：A<br>\n" +
            "\"B\"：B<br>\n" +
            "\"C\"：C<br>\n" +
            "\"D\"：D",
        required = true,
        minLength = 1,
        maxLength = 1
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(min = 1, max = 1)
    val grade: String?,

    @get:Schema(
        description = "送迎プラン",
        required = true,
        maxLength = 200
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 200)
    val transferPlan: String?,

    @get:Schema(
        description = "送迎プラン2",
        required = true,
        maxLength = 200
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 200)
    val transferPlan2: String?,

    @get:Schema(
        description = "送迎プラン3",
        required = true,
        maxLength = 200
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 200)
    val transferPlan3: String?,

    @get:Schema(
        description = "送迎プラン4",
        required = true,
        maxLength = 200
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 200)
    val transferPlan4: String?,

    @get:Schema(
        description = "送迎プラン5",
        required = true,
        maxLength = 200
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 200)
    val transferPlan5: String?,

    @get:Schema(
        description = "送迎プラン6",
        required = true,
        maxLength = 200
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 200)
    val transferPlan6: String?,

    @get:Schema(
        description = "コースコード",
        required = true,
        maxLength = 80
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 80)
    val courseCode: String?,

    @get:Schema(
        description = "コースコード2",
        required = true,
        maxLength = 80
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 80)
    val courseCode2: String?,

    @get:Schema(
        description = "コースコード3",
        required = true,
        maxLength = 80
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 80)
    val courseCode3: String?,

    @get:Schema(
        description = "コースコード4",
        required = true,
        maxLength = 80
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 80)
    val courseCode4: String?,

    @get:Schema(
        description = "表示<br>\n" +
            "\"0\"：OFF<br>\n" +
            "\"1\"：ON",
        required = true,
        minLength = 1,
        maxLength = 1
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(min = 1, max = 1)
    val display: String?,

    @get:Schema(
        description = "表示順位",
        required = true,
        minimum = "0"
    )
    @field:NotNull
    @field:NotBlank
    @field:Min(0)
    val displayOrder: Int?,

    @get:Schema(
        description = "観光プラン不可",
        required = true,
        minimum = "0"
    )
    @field:NotNull
    @field:NotBlank
    @field:Min(0)
    val sightseeingPlanNotAvailable: Int?,

    @get:Schema(
        description = "同期ホテルコード（JTOS）",
        required = false,
        maxLength = 80
    )
    @field:Size(max = 80)
    val syncHotelCodeJtos: String?,

    @get:Schema(
        description = "同期ホテルコード（エアトリ）",
        required = false,
        maxLength = 80
    )
    @field:Size(max = 80)
    val syncHotelCodeAirTrip: String?,

    @get:Schema(
        description = "同期ホテルコード（DerbySoft）",
        required = false,
        maxLength = 80
    )
    @field:Size(max = 80)
    val syncHotelCodeDerbySoft: String?,

    @get:Schema(
        description = "精算方法（Derbysoft）<br>\n" +
            "\"1\"：VCC<br>\n" +
            "\"2\"：INVOICE",
        required = false,
        minLength = 1,
        maxLength = 1
    )
    @field:Size(min = 1, max = 1)
    val paymentDerbysoft: String?,

    @get:Schema(
        description = "電話番号",
        required = true,
        maxLength = 80
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 80)
    val telephoneNumber: String?,

    @get:Schema(
        description = "FAX番号",
        required = true,
        maxLength = 80
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 80)
    val faxNumber: String?,

    @get:Schema(
        description = "郵便番号",
        required = true,
        maxLength = 20
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 20)
    val zipCode: String?,

    @get:Schema(
        description = "住所(英語)",
        required = true,
        maxLength = 200
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 200)
    val addressEn: String?,

    @get:Schema(
        description = "住所",
        required = true,
        maxLength = 200
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 200)
    val address: String?,

    @get:Schema(
        description = "チェックイン時間",
        required = true,
        maxLength = 20
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 20)
    val checkInTime: String?,

    @get:Schema(
        description = "チェックアウト時間",
        required = true,
        maxLength = 20
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 20)
    val checkOutTime: String?,

    @get:Schema(
        description = "朝食",
        required = true,
        maxLength = 200
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 200)
    val breakfast: String?,

    @get:Schema(
        description = "ロケーション",
        required = true,
        maxLength = 200
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 200)
    val location: String?,

    @get:Schema(
        description = "最寄りの駅・空港名",
        required = true,
        maxLength = 200
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 200)
    val nearby: String?,

    @get:Schema(
        description = "アクセス情報",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    val accessInformation: String?,

    @get:Schema(
        description = "周辺観光情報",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    val surroundingTouristInformation: String?,

    @get:Schema(
        description = "説明・営業日等",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    val contactDescription: String?,

    @get:Schema(
        description = "E-MAILアドレス",
        required = true,
        maxLength = 200,
        format = "email"
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 200)
    @field:Email(
        regexp = "(?:[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\\.)+[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-zA-Z0-9-]*[a-zA-Z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])",
        message = "電子メールアドレスとして正しい形式にしてください。"
    )
    val email: String?,

    @get:Schema(
        description = "URL",
        required = true,
        maxLength = 200
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 200)
    val linkUrl: String?,

    @get:Schema(
        description = "緯度",
        required = true,
        maxLength = 20
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 20)
    val latitude: String?,

    @get:Schema(
        description = "経度",
        required = true,
        maxLength = 20
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 20)
    val longitude: String?,

    @get:Schema(
        description = "備考",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    val remarks: String?,

    @get:Schema(
        description = "ホテル見出し",
        required = true,
        maxLength = 200
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 200)
    val hotelCaption: String?,

    @get:Schema(
        description = "ホテル概要",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    val hotelOverview: String?,

    @get:Schema(
        description = "改装内容",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    val renovationDescription: String?,

    @get:Schema(
        description = "設備・施設IDリスト",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val listEquipmentFacilitiesId: List<String>?,

    @get:Schema(
        description = "リゾートフィー金額",
        required = true,
        minimum = "0"
    )
    @field:NotNull
    @field:NotBlank
    @field:Min(0)
    val resortFeeAmount: Int?,

    @get:Schema(
        description = "通貨コード",
        required = true,
        minLength = 3,
        maxLength = 3
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(min = 3, max = 3)
    val currency: String?,

    @get:Schema(
        description = "年齢制限",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    val ageRequirement: String?,

    @get:Schema(
        description = "デポジット案内",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    val depositGuide: String?,

    @get:Schema(
        description = "予備(フリーフォーム)",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    val reserve: String?,

    @get:Schema(
        description = "リゾートフィー他付加価値料金(フリーフォーム)",
        required = true
    )
    val resortFeeAddAmount: Int?,

    @get:Schema(
        description = "ホテルチェーン",
        required = true,
        maxLength = 200
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max = 200)
    val hotelChain: String?,

    @get:Schema(
        description = "自社仕入れホテルコード",
        required = false,
        maxLength = 80
    )
    @field:Size(max = 80)
    val localHotelCode: String?,

    @get:Schema(
        description = "リゾートフィーに含まれるもの",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    val resortFeeTarget: String?,

    @get:Schema(
        description = "自社仕入れ仕入先",
        required = false,
        maxLength = 20
    )
    @field:Size(max = 20)
    val localSupplier: String?,

    @get:Schema(
        description = "サプライヤーコード（DerbySoft）",
        required = false,
        maxLength = 200
    )
    @field:Size(max = 200)
    val supplierCodeDerbySoft: String?,

    @get:Schema(
        description = "注意事項",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    val notes: String?,

    @get:Schema(
        description = "最終更新日時",
        required = true
    )
    @JsonSerialize(using = LocalDateTimeSerializer::class)
    @JsonDeserialize(using = LocalDateTimeDeserializer::class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @field:NotNull
    @field:NotBlank
    val updatedDatetime: LocalDateTime?
)
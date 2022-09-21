package eu.kevin.api.models

import eu.kevin.api.serializers.enums.ErrorCodeSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable(with = ErrorCodeSerializer::class)
enum class ErrorCode(val code: Int) {
    @SerialName("10000") SYSTEM_ERROR(10000),
    @SerialName("10001") CANT_GET_DATA(10001),
    @SerialName("10005") INVALID_OR_EXPIRED_TOKEN(10005),
    @SerialName("10021") INVALID_PAYMENT_DATA(10021),
    @SerialName("10024") LOGIN_WAS_NOT_STARTED(10024),
    @SerialName("10030") CANT_PROCESS_PAYMENT(10030),
    @SerialName("10032") CONSENT_NOT_CREATED(10032),
    @SerialName("10035") LOGIN_ALREADY_FINISHED(10035),
    @SerialName("11000") INVALID_PSU_IP_ADDRESS(11000),

    @SerialName("20001") CURRENT_BANK_ERROR(20001),
    @SerialName("20002") OAUTH_TOKEN_OR_CODE_NOT_VALID_ANYMORE(20002),
    @SerialName("20010") PAYMENT_PRODUCT_NOT_SUPPORTED_BY_BANK(20010),
    @SerialName("20013") INCORRECT_BANK_ID(20013),
    @SerialName("20014") NOT_SUPPORTED_BANK_SECURECUSTOMERAUTH_METHOD(20014),
    @SerialName("20016") INVALID_DEBTOR_ACCOUNT(20016),
    @SerialName("20017") INSUFFICIENT_FUNDS(20017),
    @SerialName("20020") CHOSEN_SCA_METHOD_REQUIRE_VALID_PSU_PERSON_ID(20020),
    @SerialName("20017") CHOSEN_SCA_METHOD_REQUIRE_VALID_PSU_PHONE_NUMBER(20021),
    @SerialName("20022") CREDITOR_ACCOUNT_NUMBER_INVALID_OR_MISSING(20022),
    @SerialName("20023") THE_ACCOUNT_NUMBER_AND_THE_NAME_DO_NOT_COINCIDE(20023),
    @SerialName("20024") TRANSACTION_CURRENCY_IS_INVALID_OR_MISSING(20024),
    @SerialName("20025") ACCOUNT_NOT_ALLOWED(20025),
    @SerialName("20026") DEBTOR_AND_CREDITOR_ACCOUNTS_MUST_BE_DIFFERENT(20026),
    @SerialName("20029") REMITTANCE_INFORMATION_IS_NOT_VALID(20029),
    @SerialName("20030") REQUESTED_ACTION_WAS_AUTHORIZED(20030),
    @SerialName("20032") AUTHORIZATION_HEADER_IS_MISSING_OR_INVALID(20032),
    @SerialName("20033") PAYMENT_DAILY_LIMIT_EXCEEDED(20033),
    @SerialName("20034") PAYMENT_MONTHLY_LIMIT_EXCEEDED(20034),
    @SerialName("20037") SCA_METHOD_ALREADY_SELECTED(20037),
    @SerialName("20044") CREDITOR_NAME_INVALID(20044),
    @SerialName("20055") REDIRECT_APPROACH_NOT_AVAILABLE_FOR_THIS_ASPSP(20055),
    @SerialName("20056") PAYMENT_SERVICE_USER_ACCESS_BLOCKED(20056),
    @SerialName("20057") DUPLICATE_PAYMENT(20057),
    @SerialName("20058") CREDITOR_NAME_OR_INFORMATION_STRUCTURED_INVALID_OR_MISSING(20058),
    @SerialName("20059") ACCOUNT_NOT_FOUND_OR_WRONG_ACCOUNT_ID(20059),
    @SerialName("20062") INTERNET_BANK_AGREEMENT_NOT_ACTIVE_OR_NO_ACCOUNTS_ELIGIBLE(20062),
    @SerialName("20064") PSU_PASSWORD_EXPIRED_CONTACT_BANK(20064),
    @SerialName("20066") NO_BANK_ACCOUNT_RECEIVED(20066),

    @SerialName("21000") PAYMENT_WAS_CANCELLED_BEFORE_LOGIN_USING_DECOUPLED(21000),
    @SerialName("21001") PAYMENT_WAS_CANCELLED_BEFORE_LOGIN_USING_REDIRECT(21001),
    @SerialName("21002") PAYMENT_WAS_CANCELLED_BEFORE_PRESSING_PAY_USING_DECOUPLED(21002),
    @SerialName("21003") PAYMENT_WAS_CANCELLED_BEFORE_CONFIRMING_USING_DECOUPLED(21003),
    @SerialName("21004") PAYMENT_WAS_CANCELLED_BEFORE_PAYMENT_CONFIRMATION_USING_REDIRECT(21004),
    @SerialName("21100") PAYMENT_WAS_EXPIRED_BY_SYSTEM(21100),
    @SerialName("21101") PAYMENT_WAS_REJECTED_BY_BANK(21101),

    @SerialName("90005") INCORRECT_USERNAME_OR_PASSWORD(90005),
    @SerialName("90006") INCORRECT_USER_ID(90006),
    UNKNOWN_VALUE(-1);
}

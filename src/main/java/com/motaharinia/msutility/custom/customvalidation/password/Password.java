package com.motaharinia.msutility.custom.customvalidation.password;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author https://github.com/motaharinia<br>
 * انوتیشن اعتبارسنجی رمز عبور با تعیین حداقل و یا پیچیده بودن رمز <br>
 * فقط برای فیلدهای از نوع String میتوان از این اعتبارسنجی استفاده کرد
 */
@Documented
@Constraint(validatedBy = PasswordValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {

    String message() default "CUSTOM_VALIDATION.PASSWORD";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    /**
     * حداقل طول رمز عبور
     *
     * @return خروجی:
     */
    int minLength();

    /**
     * حداکثر طول رمز عبور
     *
     * @return خروجی:
     */
    int maxLength() default 16;

    /**
     * بررسی رمز عبور پیچیده انجام شود؟
     *
     * @return خروجی:
     */
    boolean complicated() default false;


    /**
     *کارکترهای خاص رمز پیچیده
     *
     * @return خروجی:
     */
    String complicatedSpecialChars() default "!@#&()–[{}]:;',?/*~$^+=<>";

}

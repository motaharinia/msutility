package com.motaharinia.msutility.custom.customvalidation.doublerange;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author https://github.com/motaharinia<br>
 * انوتیشن اعتبارسنجی محدوده اعداد اعشاری<br>
 * فقط برای فیلدهای از نوع Double میتوان از این اعتبارسنجی استفاده کرد
 */
@Documented
@Constraint(validatedBy = DoubleRangeValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DoubleRange {

    String message() default "CUSTOM_VALIDATION.DOUBLE_RANGE";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    /**
     * ابتدای محدوده عددی
     *
     * @return خروجی:
     */
    double min() default 4.9E-324;

    /**
     * انتهای محدوده عددی
     *
     * @return خروجی:
     */
    double max() default 1.7976931348623157E308;

}

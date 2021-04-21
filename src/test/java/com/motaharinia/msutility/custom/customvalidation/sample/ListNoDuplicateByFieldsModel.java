package com.motaharinia.msutility.custom.customvalidation.sample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author https://github.com/motaharinia<br>
 * Description: <br>
 *     مدل نمونه برای تست اعتبارسنجی ListNoDuplicateByFields
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListNoDuplicateByFieldsModel implements Serializable {
    String field1;
    String field2;
}

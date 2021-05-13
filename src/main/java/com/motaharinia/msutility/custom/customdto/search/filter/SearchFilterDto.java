package com.motaharinia.msutility.custom.customdto.search.filter;

import com.motaharinia.msutility.custom.customdto.search.filter.restriction.SearchFilterRestrictionDto;
import com.motaharinia.msutility.custom.customdto.search.filter.sort.SearchFilterSortDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author https://github.com/motaharinia<br>
 * این کلاس برای جستجوی پیشرفته داده ها از کلاینت به سرور استفاده میگردد
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchFilterDto implements Serializable {
    /**
     * لیستی از شرطهای جستجو
     */
    private List<SearchFilterRestrictionDto> restrictionList = new ArrayList<>();
    /**
     * لیستی از ترتیبهای صعودی/نزولی دلخواه
     */
    private List<SearchFilterSortDto> sortList = new ArrayList<>();
    /**
     * صفحه مورد نظر برای دریافت در حالت صفحه بندی و اسمارت رندرینگ
     */
    private Long pageNo = 0L;
    /**
     * تعداد سطر مورد نیاز در هر صفحه
     */
    private Long pageRowSize = Long.MAX_VALUE;
}

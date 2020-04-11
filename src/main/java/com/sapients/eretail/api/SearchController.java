package com.sapients.eretail.api;

import com.sapients.eretail.search.dto.Filter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "api")
public class SearchController {
    @GetMapping(path = "search")
    public ResponseEntity<Object> search(@RequestParam String query) {

        return new ResponseEntity<Object>("Hello World "+ query, new HttpHeaders(), HttpStatus.OK);
    }
    private List<Filter> map(String filters) {
        List<Filter> filterList = new ArrayList<>();
        if (filters == null) {
            return filterList;
        }
        if (filters.contains(";")) {
            for (String filter : filters.split(";")) {
                filterList.addAll(this.mapValues(filter));
            }
        } else {
            filterList.addAll(this.mapValues(filters));
        }
        return filterList.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    private List<Filter> mapValues(String filter) {
        List<Filter> filters = new ArrayList<>();
        // check if filter string is valid
        if (!filter.contains(":")) {
            return filters;
        }
        final String[] values = filter.split(":");
        if (values[1].contains(",")) {
            for (String f : values[1].split(",")) {
                filters.add(new Filter(values[0], f));
            }
        } else {
            filters.add(new Filter(values[0], values[1]));
        }

        return filters;
    }
}

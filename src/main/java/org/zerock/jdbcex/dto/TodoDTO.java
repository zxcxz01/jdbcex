package org.zerock.jdbcex.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

//JPA에서는 DTO가 필수
@Data   //getter, setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TodoDTO {

    private long tno;

    private String title;

    private LocalDate dueDate;

    private boolean finished;

}


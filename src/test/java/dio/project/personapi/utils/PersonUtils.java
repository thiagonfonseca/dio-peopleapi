package dio.project.personapi.utils;

import dio.project.personapi.dto.request.PersonDTO;
import dio.project.personapi.entity.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final String FIRST_NAME = "Thiago";
    private static final String LAST_NAME = "Fonseca";
    private static final String CPF_NUMBER = "310.220.018-41";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(1984, 10, 24);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("24-10-1984")
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }
}

package com.crm.crm.p3;

import lombok.Data;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class Application {

    private LocalDate applicationStartDate;
    private LocalDate applicationEndDate;
    private int fine;

    public Application(LocalDate applicationStartDate, LocalDate applicationEndDate) {
        this.applicationStartDate = applicationStartDate;
        this.applicationEndDate = applicationEndDate;
        this.fine = 0;
    }


    public void checkFine(){
        LocalDate currentDate = LocalDate.now();
        if(applicationEndDate.isBefore(currentDate)){
            fine=25;
        }
    }

    @Override
    public String toString(){
        return "End Date: " + applicationEndDate + ", Fine: " + fine + " Rs";
    }

    public static void main(String[] args) {

        List<Application> applications = List.of(
                new Application(LocalDate.of(2025, 1, 1), LocalDate.of(2025, 2, 1)),
                new Application(LocalDate.of(2025, 3, 1), LocalDate.of(2025, 4, 1)),
                new Application(LocalDate.of(2025, 2, 1), LocalDate.of(2025, 2, 15))
        );

        List<Application> processedApplications =
                applications.stream().peek(Application::checkFine).collect(Collectors.toList());

        processedApplications.forEach(System.out::println);

    }

}


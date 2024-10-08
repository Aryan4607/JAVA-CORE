/*Create an object class with constructor parameters(company name,model ,year,total_seats) */
class Car {

    String Company_name;
    String Model;
    int Year;
    int Total_seats;

    String getCompany_name() {
        return Company_name;
    }

    String getModel() {
        return Model;

    }

    int getYear() {
        return Year;

    }

    int getTotal_seats() {
        return Total_seats;

    }

    Car(String Company_name, String Model, int Year, int Total_seats) {
        this.Company_name = Company_name;
        this.Model = Model;
        this.Total_seats = Total_seats;
        this.Year = Year;

    }

}

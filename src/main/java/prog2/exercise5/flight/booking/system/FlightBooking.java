package prog2.exercise5.flight.booking.system;

import java.time.LocalDate;
import java.util.Random;

public class FlightBooking {
    private String FlightCompany;
    private String[] PassengerFullName;
    private String[] passengerGender;
    private int [] passengerAge;
    private String DestinationAirport;
    private String SourceAirport;
    private LocalDate DepartureDate;
    private LocalDate ReturnDate;
    private int ChildPassengers;
    private int AdultPassengers;
    private int TotalPassengers;
    private int totalTickets;
    private LocalDate TripDate;
    private double DepartureTicketPrice;
    private double ReturnTicketPrice;
    private double TotalTicketPrice;

    /* public void setPassengerFullNamesName( String name) {
         PassengerFullName = name;
     }
         public FlightBooking(String aNull, LocalDate depart, LocalDate returnDate ,int i,int i1){
         this.PassengerFullName = aNull;
         this.DepartureDate = depart;
         this.ReturnDate = returnDate;
         this.ChildPassengers = i;
         this.AdultPassengers = i1;
     }*/
    public FlightBooking(int totalTickets){
        this.totalTickets = totalTickets;
        this.PassengerFullName = new String[totalTickets];
        this.passengerGender = new String[totalTickets];
        this.passengerAge = new int[totalTickets];
        this.TicketNumber = new String[totalTickets];
    }
    String [] fullName = {"Matt Jive", "Sally Fields", "Posh Quattro"};
    String [] gender = {"Male", "Female", "Other"};
    int [] age = {43, 32, 21};
    String sdepart = "2023-03-04";
    LocalDate departureDate = LocalDate.parse(sdepart);
    String sreturn = "2023-03-05";
    LocalDate returnDate = LocalDate.parse(sreturn);
    /* public void setTripDate(LocalDate tripDate){
         long diff = returnDate.toEpochDay() - departureDate.toEpochDay();
         if (diff == 0) {
             returnDate = departureDate.plusDays(1);
         } else if (diff == 1) {
             returnDate = departureDate.plusDays(2);
         }
         this.returnDate = departureDate.plusDays(2);
     }*/
    public LocalDate getTripDate(){
        return TripDate;
    }
    private TripSource tripSource;
    enum TripSource {
        NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS
    }
    public TripSource getTripSource() {
        return tripSource;
    }
    public void setTripSource(String source) {
        switch (source) {
            case "1":
                this.tripSource = TripSource.NANJING;
                break;
            case "2":
                this.tripSource = TripSource.BEIJING;
                break;
            case "3":
                this.tripSource = TripSource.OULU;
                break;
            case "4":
                this.tripSource = TripSource.HELSINKI;
                break;
            case "5":
                this.tripSource = TripSource.SHANGHAI;
                break;
            case "6":
                this.tripSource = TripSource.PARIS;
                break;
            default:
                break;
        }
    }
    private TripDestination tripDestination;
    enum TripDestination {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS
    }
    public TripDestination getTripDestination() {
        return tripDestination;
    }
    public void setTripDestination(String tripDestination, String tripDestination2) {
        switch (tripDestination2) {
            case "1":
                this.tripDestination = TripDestination.NANJING;
                break;
            case "2":
                this.tripDestination = TripDestination.BEIJING;
                break;
            case "3":
                this.tripDestination = TripDestination.SHANGHAI;
                break;
            case "4":
                this.tripDestination = TripDestination.OULU;
                break;
            case "5":
                this.tripDestination = TripDestination.HELSINKI;
                break;
            case "6":
                this.tripDestination = TripDestination.PARIS;
                break;
            default:
                break;
        }
    }
    private String FlightBooking;
    private int num2;
    private BookingClass bookingClass;
    enum BookingClass {
        FIRST, BUSINESS, ECONOMY
    }
    public void setBookingClass(String bookingClass){
        switch (bookingClass){
            case "1":
                this.bookingClass = BookingClass.FIRST;
                num2=1;
                break;
            case "2":
                this.bookingClass = BookingClass.BUSINESS;
                num2=2;
                break;
            case "3":
                this.bookingClass = BookingClass.ECONOMY;
                num2=3;
                break;
            default:
                break;
        }
    }
    private TripType tripType;
    private int num;
    enum TripType {
        ONE_WAY, RETURN
    }
    public TripType getTripType() {
        return tripType;
    }
    public void setTripType(String triptype) {
        switch (triptype) {
            case "1":
                this.tripType = TripType.ONE_WAY;
                num=1;
                break;
            case "2":
                this.tripType = TripType.RETURN;
                num=2;
                break;
            default:
                break;
        }
    }
    private String sourceAirport;
    private int nums;
    public String getSourceAirport() {
        return sourceAirport;
    }
    public void setSourceAirport(String sourceAirport) {
        switch (tripSource) {
            case NANJING:
                this.sourceAirport = "Nanjing Lukou International Airport";
                nums=1;
                break;
            case OULU:
                this.sourceAirport = "Oulu Airport";
                nums=2;
                break;
            case BEIJING:
                this.sourceAirport = "Beijing Capital International Airport";
                nums=3;
                break;
            case PARIS:
                this.sourceAirport = "Paris Charles de Gaulle Airport";
                num=4;
                break;
            case HELSINKI:
                this.sourceAirport = "Helsinki Airport";
                nums=5;
                break;
            case SHANGHAI:
                this.sourceAirport = "Shanghai Pudong International Airport";
                nums=6;
                break;
            default:
                break;
        }
    }
    private String destinationAirport;
    int numd;
    public String getDestinationAirport() {
        return destinationAirport;
    }
    public void setDestinationAirport(String destinationAirport1, String destinationAirport2) {
        this.destinationAirport = "";
        switch (tripDestination) {
            case NANJING:
                this.destinationAirport = "Nanjing Lukou International Airport";
                numd=1;
                break;
            case BEIJING:
                this.destinationAirport = "Beijing Capital International Airport";
                numd=2;
                break;
            case SHANGHAI:
                this.destinationAirport = "Shanghai Pudong International Airport";
                numd=3;
                break;
            case OULU:
                this.destinationAirport = "Oulu Airport";
                numd=4;
                break;
            case HELSINKI:
                this.destinationAirport = "Helsinki Airport";
                numd=5;
                break;
            case PARIS:
                this.destinationAirport = "Paris Charles de Gaulle Airport";
                numd=6;
                break;
            default:
                break;
        }
    }
    private String[] TicketNumber;
    Random random = new Random();
    public void setTicketNumber(int index) {
        String ticketNumber = null;
        switch (num) {
            case 1:
                ticketNumber = "11";
                break;
            case 2:
                ticketNumber = "22";
                break;
        }
        switch (num2) {
            case 1:
                ticketNumber = ticketNumber + "F";
                break;
            case 2:
                ticketNumber = ticketNumber + "B";
                break;
            case 3:
                ticketNumber = ticketNumber + "E";
                break;
        }
        for (int i = 0; i < 4; i++) {
            char n = (char) ((random.nextInt(26) + 65));
            ticketNumber = ticketNumber + n;
        }
        switch (nums) {
            case 3:
                switch (numd){
                    case 2:
                    case 1:
                        ticketNumber = ticketNumber + "DOM";
                        break;
                    case 5:
                    case 6:
                    case 4:
                        ticketNumber = ticketNumber + "INT";
                        break;
                    default:
                        break;
                }
                break;
            case 4:
                switch (numd){
                    case 5:
                        ticketNumber = ticketNumber + "DOM";
                        break;
                    case 6:
                    case 2:
                    case 3:
                    case 1:
                        ticketNumber= ticketNumber + "INT";
                        break;
                    default:
                        break;
                }
                break;
            case 1:
                switch (numd){
                    case 3:
                    case 1:
                        ticketNumber = ticketNumber + "DOM";
                        break;
                    case 6:
                    case 5:
                    case 4:
                        ticketNumber = ticketNumber + "INT";
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                switch (numd){
                    case 3:
                    case 1:
                        ticketNumber = ticketNumber + "DOM";
                        break;
                    case 6:
                    case 5:
                    case 4:
                        ticketNumber = ticketNumber + "INT";
                        break;
                    default:
                        break;
                }
                break;
            case 6:
                switch (numd){
                    case 5:
                    case 4:
                    case 2:
                    case 3:
                    case 1:
                        ticketNumber = ticketNumber + "INT";
                        break;
                    default:
                        break;
                }
                break;
            case 5:
                switch (numd){
                    case 4:
                        ticketNumber = ticketNumber + "DOM";
                        break;
                    case 6:
                    case 2:
                    case 3:
                    case 1:
                        ticketNumber = ticketNumber + "INT";
                        break;
                    default:
                        break;
                }
                break;
        }
        this.TicketNumber[index] = ticketNumber;
    }
    public String getPassengerGender(int index){
        return passengerGender[index];
    }
    public void setPassengerGender(int index,String passengerGender) {
        this.passengerGender = new String[]{"Male", "Female", "Other"};
    }
    public int getPassengerAge(int index){
        return passengerAge[index];
    }
    public void setPassengerAge(int index,int passengerAge) {
        this.passengerAge = new int[]{43, 32, 21};
    }
    public String getTicketNumber(int index) {
        setTicketNumber(1);
        return TicketNumber[index];
    }
    public void setPassengerFullName(int index,String passengerFullName){
        this.PassengerFullName = new String[]{"Matt Jive", "Sally Fields", "Posh Quattro"};
    }
    public String getPassengerFullName(int index){
        return PassengerFullName[index];
    }
    public String getFlightCompany()
    {
        return FlightCompany;
    }
    public LocalDate getDepartureDate()
    {
        return DepartureDate;
    }
    public LocalDate getReturnDate()
    {
        return ReturnDate;
    }
    public int getChildPassengers()
    {
        return ChildPassengers;
    }
    public int getAdultPassengers()
    {
        return AdultPassengers;
    }
    public int getTotalPassengers()
    {
        return TotalPassengers;
    }
    public double getTotalTicketPrice()
    {
        return TotalTicketPrice;
    }
    public double getDepartureTicketPrice() {

        return DepartureTicketPrice;
    }

    public double getReturnTicketPrice() {

        return ReturnTicketPrice;
    }
    public void setFlightCompany(String flightCompany)
    {
        this.FlightCompany = flightCompany;
    }
    public void setDepartureDate(LocalDate departureDate)
    {
        String sdepart = "2023-03-04";
        this.DepartureDate = LocalDate.parse(sdepart);
    }

    public void setReturnDate(LocalDate returnDate)
    {
        String sreturn =  "2023-03-05";
        this.ReturnDate = departureDate.plusDays(2);
    }

    public void setAdultPassengers(int adultPassengers)
    {
        this.AdultPassengers = adultPassengers;
    }

    public void setChildPassengers(int childPassengers)
    {
        this.ChildPassengers = childPassengers;
    }

    public void setTotalPassengers(int totalPassengers, int TotalPassengers)
    {
        this.TotalPassengers = ChildPassengers+AdultPassengers;
    }
    public void setTotalTicketPrice()
    {
        this.TotalTicketPrice = Math.abs(2* ((0*(300 + (0.15*300) + (0.1*300) + 250)) + (3*(300 + (0.15*300) + (0.1*300) + 250))));
    }
    public void setReturnTicketPrice() {

        this.ReturnTicketPrice = ReturnTicketPrice;
    }
    public void setDepartingTicketPrice(int child, int adult) {

        this.DepartureTicketPrice = DepartureTicketPrice;
    }
    public String toString() {
        return "Dear " + PassengerFullName + ". Thank you for booking your flight with " +
                FlightCompany + ". \nFollowing are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + TicketNumber + "\n" +
                "From " + tripSource + " to " + tripDestination + "\n" +
                "Date of departure: " + DepartureDate + "\n" +
                "Date of return: " + ReturnDate + "\n" +
                "Total passengers: " + TotalPassengers + "\n" +
                "Total ticket price in Euros: " + TotalTicketPrice;
    }
    private ConfirmationMessage confirmationMessage;

    enum ConfirmationMessage {
        CHANGE, SAVE
    }

    public void setConfirmationMessage(String confirmationmessage) {
        switch (confirmationmessage) {
            case "1":
                this.confirmationMessage = confirmationMessage.CHANGE;
                System.out.println("Thank you for booking your flight with " + FlightCompany + ". Following are the details \n" +
                        "of your booking and the trip: \n" +
                        "Ticket Number: " + TicketNumber + "\n" +
                        "Passenger Name: " + PassengerFullName + "\n" +
                        "From TripSource to " + tripDestination + "\n" +
                        "Date of departure: " + DepartureDate + "\n" +
                        "Date of return: ReturnDate (Changed from old ReturnDate to new\n" +
                        ReturnDate + ")\n" +
                        "Total passengers: " + TotalPassengers + "\n" +
                        "Total ticket price in Euros: " + TotalTicketPrice + "\n" +
                        "IMPORTANT NOTICE: As per our policy, the return date was changed because it was \n" +
                        "less than two days apart from your departure date");
                break;
            case "2":
                this.confirmationMessage = confirmationMessage.SAVE;
                System.out.println("Thank you for booking your flight with " + FlightCompany + ".Following are the details \n" +
                        "of your booking and the trip: \n" +
                        "Ticket Number: " + TicketNumber + "\n" +
                        "Passenger Name: " + PassengerFullName + "\n" +
                        "From TripSource to " + tripDestination + "\n" +
                        "Date of departure: " + DepartureDate + "\n" +
                        "Date of return: " + ReturnDate + "\n" +
                        "Total passengers: " + TotalPassengers + "\n" +
                        "Total ticket price in Euros: " + TotalTicketPrice + "\n");

                break;
        }
    }

    public void displayTripDetails() {
        System.out.println("Thank you for booking your flights with " + FlightCompany + "\n");
        System.out.println("You reserved a total of" + totalTickets + " tickets.\n");
        for (int i = 0; i < totalTickets;i++){
            System.out.println("Here are the trip details for Passenger No." + (i + 1));
            System.out.println("Passenger's Ticket Number:" + getTicketNumber(i));
            System.out.println("Passenger's Full Name: " + getPassengerFullName(i));
            System.out.println("Passenger's Age:" + getPassengerAge(i));
            System.out.println("Passenger's Gender:" + getPassengerGender(i));
            System.out.println("From:" + tripSource);
            System.out.println("To:" + tripDestination);
            System.out.println("The flight departs on:" + departureDate);
            System.out.println("And the return flight is on:" + returnDate);
        }
    }
}

package Project.Model;

import javax.print.DocFlavor;

/**
 *
 * @author mufic
 */
public class model {

    ///////////////**for table airport////
    private String airport_name;
    //////////////////**for table booking//////
    private int no_of_ticket;
    private String name;
    private String email;
    private String state;
    private String from;
    private String airport;
    private String to;
    private String date;
    private int num_of_passenger;
    private int num_of_childern;
    private int num_of_baby;
    private int total_price;
    private String notes;
    //////////////////////// **for table booking hotel/\
    private int ticket_id;
    private String counrty;
    private String hotel;
    private int no_of_rooms;
    private int no_of_nights;
    private int totalh_price;
    /////////////////////////////**for tablecountries/\/\
    private String counrty_name;
    private int price_on_go_pass;
    private int price_on_go_childern;
    private int price_on_go_baby;
    private int p_on_go_back_pass;
    private int p_on_go_back_childern;
    private int p_on_go_back_baby;
    /////////////////////////**for table hotel/\/\/\
    private int country_id;
    private String hotel_name;
    private int price_at_night;
    private int phone;
    private String address;
    //////////////////////////////**for table province/\/\/\/\
    private int airport_id;
    private String province_name;

    //////////////////////////////////////////////////////////////
    //**************************************************************************
    ////////////////////////////////////table airport methods////////////////////////////////////////////////////
    public void set_airport_name(String airport_name) {

        this.airport_name = airport_name;
    }

    public String get_airport_name() {

        return airport_name;
    }
    //**************************************************************************
///////////////////////////////end////////////////////////////////////////////
    //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\booking table methods\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ 

    public void set_no_of_ticket(int no_of_ticket) {

        this.no_of_ticket = no_of_ticket;
    }

    public int get_no_of_ticket() {

        return no_of_ticket;
    }    //**************************************************************************

    public void set_name(String name) {

        this.name = name;
    }

    public String get_name() {

        return name;
    }    //**************************************************************************

    public void set_email(String email) {

        this.email = email;
    }

    public String get_email() {

        return email;
    }    //**************************************************************************

    public void set_state(String state) {

        this.state = state;
    }

    public String get_state() {

        return state;
    }    //**************************************************************************

    public void set_from(String from) {

        this.from = from;
    }

    public String get_from() {

        return from;
    }    //**************************************************************************

    public void set_airport(String airport) {

        this.airport = airport;
    }

    public String get_airport() {

        return airport;
    }    //**************************************************************************

    public void set_to(String to) {

        this.to = to;
    }

    public String get_to() {

        return to;
    }    //**************************************************************************

    public void set_date(String date) {

        this.date = date;
    }

    public String get_date() {

        return date;
    }    //**************************************************************************

    public void set_num_of_passenger(int num_of_passenger) {

        this.num_of_passenger = num_of_passenger;
    }

    public int get_num_of_passenger() {

        return num_of_passenger;
    }    //**************************************************************************

    public void set_num_of_childern(int num_of_childern) {

        this.num_of_childern = num_of_childern;
    }

    public int get_num_of_childern() {

        return num_of_childern;
    }    //**************************************************************************

    public void set_num_of_baby(int num_of_baby) {

        this.num_of_baby = num_of_baby;
    }

    public int get_num_of_baby() {

        return num_of_baby;
    }    //**************************************************************************

    public void set_total_price(int total_price) {

        this.total_price = total_price;
    }

    public int get_total_price() {

        return total_price;
    }    //**************************************************************************

    public void set_notes(String notes) {

        this.notes = notes;
    }

    public String get_notes() {

        return notes;
    }    //**************************************************************************
//////////////////////////////////////////end////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////booking hotel table methods//////////////////////////////////////////////////////////////////////    

    public void set_ticket_id(int ticket_id) {

        this.ticket_id = ticket_id;
    }

    public int get_ticket_id() {

        return ticket_id;
    }
    //**************************************************************************

    public void set_counrty(String counrty) {

        this.counrty = counrty;
    }

    public String get_counrty() {

        return counrty;
    }

    //**************************************************************************
    public void set_hotel(String hotel) {

        this.hotel = hotel;
    }

    public String get_hotel() {

        return hotel;
    }
    //**************************************************************************

    public void set_no_of_rooms(int no_of_rooms) {

        this.no_of_rooms = no_of_rooms;
    }

    public int get_no_of_rooms() {

        return no_of_rooms;
    }
    //**************************************************************************

    public void set_no_of_nights(int no_of_nights) {

        this.no_of_nights = no_of_nights;
    }

    public int get_no_of_nights() {

        return no_of_nights;
    }
    //**************************************************************************

    public void set_totalh_price(int totalh_price) {

        this.totalh_price = totalh_price;
    }

    public int get_totalh_price() {

        return totalh_price;
    }
    //**************************************************************************
    ////////////////////////////////////////////////////////////////end///////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////countries table methods//////////////////////////////////////////////////////////////

    public void set_country_name(String country_name) {

        this.counrty_name = country_name;
    }

    public String get_country_name() {

        return counrty_name;
    }
    //**************************************************************************

    public void set_price_on_go_pass(int price_on_go_pass) {

        this.price_on_go_pass = price_on_go_pass;
    }

    public int get_price_on_go_pass() {

        return price_on_go_pass;
    }
    //**************************************************************************

    public void set_price_on_go_childern(int price_on_go_childern) {

        this.price_on_go_childern = price_on_go_childern;
    }

    public int get_price_on_go_childern() {

        return price_on_go_childern;
    }
    //**************************************************************************

    public void set_price_on_go_baby(int price_on_go_baby) {

        this.price_on_go_baby = price_on_go_baby;
    }

    public int get_price_on_go_baby() {

        return price_on_go_baby;
    }
    //**************************************************************************

    public void set_p_on_go_back_pass(int p_on_go_back_pass) {

        this.p_on_go_back_pass = p_on_go_back_pass;
    }

    public int get_p_on_go_back_pass() {

        return p_on_go_back_pass;
    } //*******************************************************************************************/\/\/\/\ 

    public void set_p_on_go_back_childern(int p_on_go_back_childern) {

        this.p_on_go_back_childern = p_on_go_back_childern;
    }

    public int get_p_on_go_back_childern() {

        return p_on_go_back_childern;
    } //*********************************************************************************/\/\/\/\ 

    public void set_p_on_go_back_baby(int p_on_go_back_baby) {

        this.p_on_go_back_baby = p_on_go_back_baby;
    }

    public int get_p_on_go_back_baby() {

        return p_on_go_back_baby;
    } //**************************************************************************************/\/\ 
    /////////////////////////////////////////////end/////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////hotels table methods///////////////////////////////////////////////////////////////////////////

    public void set_country_id(int country_id) {

        this.country_id = country_id;
    }

    public int get_country_id() {

        return country_id;
    }//*****************************************************************************/\/\/\/  

    public void set_hotel_name(String hotel_name) {

        this.hotel_name = hotel_name;
    }

    public String get_hotel_name() {

        return hotel_name;
    } //***************************************************************************/\/\/\/\ 

    public void set_price_at_night(int price_at_night) {

        this.price_at_night = price_at_night;
    }

    public int get_price_at_night() {

        return price_at_night;
    }//************************************************************************************/\/\/\/\/\  

    public void set_phone(int phone) {

        this.phone = phone;
    }

    public int get_phone() {

        return phone;
    }//***********************************************************************************************/\/\/\/\/\  

    public void set_address(String address) {

        this.address = address;
    }

    public String get_address() {

        return address;
    } //**********************************************************************************/\/\/\/\/\/\/\ 
    //////////////////////////////////////////////////////end///////////////////////////////////
    /////////////////////////////////////////////province table methods//////////////////////////////////////////////////////////

    public void set_airport_id(int airport_id) {

        this.airport_id = airport_id;
    }

    public int get_airport_id() {

        return airport_id;
    }//********************************************************************/\/\/\/\/\/\/\/\/ 

    public void set_province_name(String province_name) {

        this.province_name = province_name;
    }

    public String get_province_name() {

        return province_name;
    }
    ///////////////////////////////////////////////////////////end///////////////  
}

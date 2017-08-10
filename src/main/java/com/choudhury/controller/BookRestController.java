package com.choudhury.controller;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.choudhury.domain.AttendanceDetails;
import com.choudhury.domain.Book;
import com.choudhury.domain.EmployeeDetails;
import com.choudhury.domain.ObjectWithId;
import com.choudhury.domain.TelematryData;
import com.choudhury.service.BookService;

@RestController
@RequestMapping("/book")
public class BookRestController {

    private BookService bookService;

    private Logger logger=LoggerFactory.getLogger(BookRestController.class);


    //Note: The @Named("bookService") is not required in this example (as there only instance of BookService around)
    @Inject
    public BookRestController(@Named("bookService") BookService bookService )
    {
        this.bookService=bookService;
    }


    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public TelematryData getBook(@PathVariable("id") String id) {
    	System.out.println("testing1");
        logger.debug("Provider has received request to get person with id: " + id);
        List<TelematryData> telematryDatas= dataSetup();
        TelematryData final1=new TelematryData();
        for(TelematryData telematryData: telematryDatas ){
        	if(id.equalsIgnoreCase(telematryData.getDeviceUuid())){
        		final1=telematryData;
        	}
        	/*if(id == 2L){
        		final1=telematryData;
        		
        	}
        	
        	if(id == 3L){
        		final1=telematryData;
        		
        	}*/
        	
        	
        	
        	
        }
        
        
        return final1;
    }

    private List<TelematryData> dataSetup() {
	
    	List<TelematryData> telematryDatas =new ArrayList<TelematryData>();
	// 1
    	TelematryData data1=new TelematryData();
    	data1.setDeviceUuid("df093c9d3ce02a3947b9");//d72fcd47c632c2b90c16   d728cd47c632c2b90c16
    	data1.setEmpId(9692L);
    	
    	EmployeeDetails details1=new EmployeeDetails();
    	details1.setEmployeeName("Stephen");	
    	details1.setEmpId(9692L);
    	details1.setUrl("https://media.licdn.com/mpr/mpr/shrinknp_400_400/AAEAAQAAAAAAAAhFAAAAJDkzNzk1MTJkLTM2MmItNDU5NS1iOTkyLWNkZGRiMTI0MjQ4OQ.jpg");
    	//            holder.address.setText(String.format(Locale.getDefault(), "%.2f",b.getDistance()));//b.getBeaconAddress()

    	
    	AttendanceDetails attendanceDetails1=new AttendanceDetails();
    	
    	attendanceDetails1.setEmpId(9692L);
    	attendanceDetails1.setLoginSource("DLF");
    	attendanceDetails1.setLogoutSource("TRL");
    	Calendar cal = Calendar.getInstance();
    	cal.add(Calendar.DATE, -2);
    	
    	
    	Date loginDate = cal.getTime();
    	attendanceDetails1.setLoginTime(loginDate);
    	
    	Calendar cal1 = Calendar.getInstance();
    	cal1.add(Calendar.DATE, -1);
    	cal1.add(Calendar.HOUR, -4);
    	
    	Date logoutDate = cal1.getTime();
    	attendanceDetails1.setLogoutTime(logoutDate);
    	
	    	attendanceDetails1.setConsolidatedHours("8"+"h "+"32");
	    	data1.setAttendance(attendanceDetails1);
	    	data1.setEmployeeDetails(details1);
	    	
	    	telematryDatas.add(data1);
    	
	    	// 2
	    	TelematryData data2=new TelematryData();
	    	data2.setDeviceUuid("3c91837369cb21cf8648");
	    	data2.setEmpId(10673L);
	    	//String result = yourString.replaceAll("[-+.^:,]","");
	    	EmployeeDetails details2=new EmployeeDetails();
	    	details2.setEmployeeName("Mani N");
	    	details2.setEmpId(10673L);
	    	details2.setUrl("https://media.licdn.com/mpr/mpr/shrinknp_400_400/AAEAAQAAAAAAAAspAAAAJDBlMmY1OGM1LTc3OTQtNGJhMS05YjI2LTMxZGUzMGVjN2IzNA.jpg");
	    	
	    	
	    	AttendanceDetails attendanceDetails2=new AttendanceDetails();
	    	
	    	attendanceDetails2.setEmpId(10673L);
	    	attendanceDetails2.setLoginSource("VPN");
	    	attendanceDetails2.setLogoutSource("TRL");
	    
	    	Calendar cale2 = Calendar.getInstance();
	    	cale2.add(Calendar.DATE, -3);
	    	
	    	Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    	//String s = formatter.format(date);
	    	Date loginDatee2 = cal.getTime();
	    	attendanceDetails2.setLoginTime(loginDatee2);
	    	
	    	Calendar cale2out = Calendar.getInstance();
	    	cale2out.add(Calendar.DATE, -2);
	    	cale2out.add(Calendar.HOUR, -4);
	    	
	    	Date logoutDatee2 = cale2.getTime();
	    	attendanceDetails2.setLogoutTime(logoutDatee2);
	    	System.out.println("TT");
	    	attendanceDetails2.setConsolidatedHours("9"+" h "+"32");
		    data2.setAttendance(attendanceDetails2);
		    System.out.println(attendanceDetails2.getConsolidatedHours());
		    data2.setEmployeeDetails(details2);
		    telematryDatas.add(data2);
    	
		 // 3
		    TelematryData data3=new TelematryData();
	    	data3.setDeviceUuid("c9f5ff164055ed7d1922");
	    	data3.setEmpId(10673L);
	    	//String result = yourString.replaceAll("[-+.^:,]","");
	    	EmployeeDetails details3=new EmployeeDetails();
	    	details3.setEmployeeName("Navin J");
	    	details3.setEmpId(10673L);
	    	details3.setUrl("http://bankruptcy-ua.com/images/thumb/missing.png");
	    	
	    	
	    	AttendanceDetails attendanceDetails3=new AttendanceDetails();
	    	
	    	attendanceDetails3.setEmpId(10673L);
	    	attendanceDetails3.setLoginSource("VOY");
	    	attendanceDetails3.setLogoutSource("VPN");
	    
	    	Calendar cale3 = Calendar.getInstance();
	    	cale3.add(Calendar.DATE, -3);
	    	
	    	Format formatter3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    	//String s = formatter.format(date);
	    	Date loginDatee3 = cal.getTime();
	    	attendanceDetails3.setLoginTime(loginDatee3);
	    	
	    	Calendar cale3out = Calendar.getInstance();
	    	cale3out.add(Calendar.DATE, -2);
	    	cale3out.add(Calendar.HOUR, -4);
	    	
	    	Date logoutDatee3 = cale3.getTime();
	    	attendanceDetails3.setLogoutTime(logoutDatee3);
	    	System.out.println("TT");
	    	attendanceDetails3.setConsolidatedHours("9"+" h "+"32");
		    data3.setAttendance(attendanceDetails3);
		    System.out.println(attendanceDetails3.getConsolidatedHours());
		    data3.setEmployeeDetails(details3);
		    telematryDatas.add(data3);
		    
		    //4
		    TelematryData data4=new TelematryData();
		    data4.setDeviceUuid("c9f5ff164055ed7d1923");
		    data4.setEmpId(1673L);
	    	//String result = yourString.replaceAll("[-+.^:,]","");
	    	EmployeeDetails details4=new EmployeeDetails();
	    	details4.setEmployeeName("Prabhu K");
	    	details4.setEmpId(10673L);
	    	details4.setUrl("http://bankruptcy-ua.com/images/thumb/missing.png");
	    	
	    	
	    	AttendanceDetails attendanceDetails4=new AttendanceDetails();
	    	
	    	attendanceDetails4.setEmpId(10673L);
	    	attendanceDetails4.setLoginSource("VPN");
	    	attendanceDetails4.setLogoutSource("TRL");
	    
	    	Calendar cale4 = Calendar.getInstance();
	    	cale4.add(Calendar.DATE, -3);
	    	
	    	Format formatter4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    	//String s = formatter.format(date);
	    	Date loginDatee4 = cal.getTime();
	    	attendanceDetails4.setLoginTime(loginDatee4);
	    	
	    	Calendar cale4out = Calendar.getInstance();
	    	cale4out.add(Calendar.DATE, -2);
	    	cale4out.add(Calendar.HOUR, -4);
	    	
	    	Date logoutDatee4 = cale4.getTime();
	    	attendanceDetails4.setLogoutTime(logoutDatee4);
	    	System.out.println("TT");
	    	attendanceDetails4.setConsolidatedHours("9"+" h "+"32");
		    data4.setAttendance(attendanceDetails4);
		    System.out.println(attendanceDetails4.getConsolidatedHours());
		    data4.setEmployeeDetails(details4);
		    telematryDatas.add(data4);
    	
    	return telematryDatas;
	}


	@RequestMapping(value = "/check",  method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public ObjectWithId addBook(@RequestBody Book book)
    {
        return new ObjectWithId(bookService.addBook(book));
    }
}

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
    	data1.setDeviceUuid("a623af18010e94ed4d5a");
    	data1.setEmpId(9692L);
    	
    	EmployeeDetails details1=new EmployeeDetails();
    	details1.setEmployeeName("Stephen Hawkings");	
    	details1.setEmpId(9692L);
    	details1.setUrl("url");
    	
    	
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
    	
	    	attendanceDetails1.setConsolidatedHours("8"+" h "+"32");
	    	data1.setAttendance(attendanceDetails1);
	    	data1.setEmployeeDetails(details1);
	    	
	    	telematryDatas.add(data1);
    	
	    	// 2
	    	TelematryData data2=new TelematryData();
	    	data2.setDeviceUuid("df093c9d3ce02a3947b9");
	    	data2.setEmpId(10673L);
	    	//String result = yourString.replaceAll("[-+.^:,]","");
	    	EmployeeDetails details2=new EmployeeDetails();
	    	details2.setEmployeeName("Manigandan N");
	    	details2.setEmpId(10673L);
	    	details2.setUrl("url");
	    	
	    	
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
	    	data3.setDeviceUuid("0000110100001000800000805F9B34FD");
	    	data3.setEmpId(9693L);
	    	
	    	EmployeeDetails detail3=new EmployeeDetails();
	    	detail3.setEmployeeName("Steve Jobs");
	    	detail3.setEmpId(9693L);
	    	detail3.setUrl("url");
	    	
	    	
	    	AttendanceDetails attendanceDetails3=new AttendanceDetails();
	    	
	    	attendanceDetails3.setEmpId(9691L);
	    	attendanceDetails3.setLoginSource("VOY");
	    	attendanceDetails3.setLogoutSource("VOY");
	    
	    	cal1.add(Calendar.DATE, -1);
	    	cal1.add(Calendar.HOUR, -10);
	    	
	    	Date loginDate2 = cal.getTime();
	    	attendanceDetails3.setLoginTime(loginDate2);
	    	
	    	
	    	cal1.add(Calendar.DATE, -1);
	    	cal1.add(Calendar.HOUR, +1);
	    	
	    	Date logoutDate2 = cal1.getTime();
	    	attendanceDetails3.setLogoutTime(logoutDate2);
	    	
	    	//attendanceDetails2.setConsolidatedHours(((logoutDate2.getTime()-loginDate2.getTime())/ (60 * 1000) % 60)+"H "+((logoutDate2.getTime()-loginDate2.getTime())/ (60 * 1000) % 60)+" M");
		    data3.setAttendance(attendanceDetails2);
		    data3.setEmployeeDetails(detail3);
		    	
		    telematryDatas.add(data3);
		    
		    
    	
    	
    	
    	
    	
    	
    	
    	return telematryDatas;
	}


	@RequestMapping(value = "/add",  method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public ObjectWithId addBook(@RequestBody Book book)
    {
        return new ObjectWithId(bookService.addBook(book));
    }
}

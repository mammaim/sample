package com.hw.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class DealController extends AbstractController {
public static List<String> dealList = new ArrayList<String>();
@Override
protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
ModelAndView model = new ModelAndView("DealPage");
		
		String dealName  = request.getParameter("deal");
		dealList.add(dealName);
		model.addObject("dealList", dealList);
		return new ModelAndView("DealPage", "dealList", dealList);
	}
@ResponseBody
@RequestMapping(value = "/accept/api/getAccept")
public List<String> getSearchResultViaAjax(@RequestBody Deal deal) {

		for (String dealId: dealList) {
		if(deal.getDealId().equalsIgnoreCase(deal.getDealId())) {
			dealList.remove(deal.getDealId());
		}
	}
	return dealList;

}

}
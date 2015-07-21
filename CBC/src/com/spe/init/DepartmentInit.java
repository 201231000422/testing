package com.spe.init;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.spe.enums.DepartmentEnum;
import com.spe.model.Department;
import com.spe.service.DepartmentService;

public class DepartmentInit implements ServletContextListener{

//	@Resource
//	private DepartmentService departmentService;
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("init");
//		String hql = "from Department d where d.level = ?";
//		
//		List<Department> adminList = departmentService.find(hql,DepartmentEnum.admin.getValue());
//		
//		if(adminList == null || adminList.size() == 0){
//			Department department = new Department(DepartmentEnum.getDesc(DepartmentEnum.admin.getValue()),DepartmentEnum.admin.getValue(),null);
//			departmentService.save(department);
//		}
//		
//		List<Department> governorList = departmentService.find(hql,DepartmentEnum.governor.getValue());
//		
//		if(governorList == null || governorList.size() == 0){
//			Department department = new Department(DepartmentEnum.getDesc(DepartmentEnum.governor.getValue()),DepartmentEnum.governor.getValue(),null);
//			departmentService.save(department);
//		}
//		
//		List<Department> networkManagementCenterList = departmentService.find(hql,DepartmentEnum.networkManagementCenter.getValue());
//
//		if(networkManagementCenterList == null || networkManagementCenterList.size() == 0){
//			Department department = new Department(DepartmentEnum.getDesc(DepartmentEnum.networkManagementCenter.getValue()),DepartmentEnum.networkManagementCenter.getValue(),null);
//			departmentService.save(department);
//		}
//		
//		List<Department> distributionCentreList = departmentService.find(hql,DepartmentEnum.distributionCentre.getValue());
//		
//		if(distributionCentreList == null || distributionCentreList.size() == 0){
//			Department department = new Department(DepartmentEnum.getDesc(DepartmentEnum.distributionCentre.getValue()),DepartmentEnum.distributionCentre.getValue(),null);
//			departmentService.save(department);
//		}
//		
	}

}

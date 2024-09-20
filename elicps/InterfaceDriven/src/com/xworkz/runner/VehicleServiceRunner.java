package com.xworkz.runner;

import com.xworkz.repository.VehicleRepository;
import com.xworkz.repository.implement.VehicleRepository;
import com.xworkz.service.VehicleService;
import com.xworkz.service.impl.AddressServiceImpl;
public class VehicleServiceRunner {

	public static void main(String[] args) {
		

		

		public class VehicleServiceRunner {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				VehicleRepository repository=new VehicleRepositoryImp();
				VehicleService service=new VehicleServiceImp(repository);
				service.persist();
				service.merge();
				boolean res=service.clear();
				System.out.println(res);
				String res1=service.search();
				System.out.println(res1);

			}

		}

	



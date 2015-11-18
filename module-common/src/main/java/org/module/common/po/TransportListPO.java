package org.module.common.po;

public class TransportListPO {
	//中转单
		private String car;
		private String LoadingDate;
		private String transListId;
		private String carId;
		private String origin;
		private String arrival;
		/**
		 * 货柜号
		 */
		private String counterId;
		/**
		 * 监装员
		 */
		private String Supervision;
		private String[] shippingId;
		private String price;
		public TransportListPO(String car, String loadingDate,
				String transListId, String carId, String origin,
				String arrival, String counterId, String supervision,
				String[] shippingId, String price) {
			super();
			this.car = car;
			LoadingDate = loadingDate;
			this.transListId = transListId;
			this.carId = carId;
			this.origin = origin;
			this.arrival = arrival;
			this.counterId = counterId;
			Supervision = supervision;
			this.shippingId = shippingId;
			this.price = price;
		}
		public String getCar() {
			return car;
		}
		public void setCar(String car) {
			this.car = car;
		}
		public String getLoadingDate() {
			return LoadingDate;
		}
		public void setLoadingDate(String loadingDate) {
			LoadingDate = loadingDate;
		}
		public String getTransListId() {
			return transListId;
		}
		public void setTransListId(String transListId) {
			this.transListId = transListId;
		}
		public String getCarId() {
			return carId;
		}
		public void setCarId(String carId) {
			this.carId = carId;
		}
		public String getOrigin() {
			return origin;
		}
		public void setOrigin(String origin) {
			this.origin = origin;
		}
		public String getArrival() {
			return arrival;
		}
		public void setArrival(String arrival) {
			this.arrival = arrival;
		}
		public String getCounterId() {
			return counterId;
		}
		public void setCounterId(String counterId) {
			this.counterId = counterId;
		}
		public String getSupervision() {
			return Supervision;
		}
		public void setSupervision(String supervision) {
			Supervision = supervision;
		}
		public String[] getShippingId() {
			return shippingId;
		}
		public void setShippingId(String[] shippingId) {
			this.shippingId = shippingId;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		
}
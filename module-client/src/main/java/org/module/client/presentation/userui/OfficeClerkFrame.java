package org.module.client.presentation.userui;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import org.module.client.presentation.FontFactory;
import org.module.client.presentation.managementui.Cars;
import org.module.client.presentation.managementui.DriversPanel;
import org.module.client.presentation.orderui.ListTableForOfficeArrival;
import org.module.client.presentation.orderui.ListTableForOfficeLoading;
import org.module.client.presentation.orderui.ListTableForSending;
import org.module.client.presentation.statisticui.ListTableForReiceipt;

public class OfficeClerkFrame extends FatherFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private FontFactory font = new FontFactory() ;
	
	public OfficeClerkFrame() {
		
		
		super();
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel label = new JLabel("营业厅业务员");
		label.setFont(font.getStateFont());
		panel.add(label);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(font.getTabbeFont());
		tabbedPane.setOpaque(false);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new Cars();
		panel_1.setOpaque(false);
		tabbedPane.addTab("车辆管理", null, panel_1, "车辆管理");
		
		JPanel panel_2 = new DriversPanel();
		panel_2.setOpaque(false);
		tabbedPane.addTab("司机管理", null, panel_2, "司机管理");
		
		JPanel panel_3 = new ListTableForOfficeLoading();
		panel_3.setOpaque(false);
		tabbedPane.addTab("订单装车", null, panel_3, "订单装车");
		
		JPanel panel_4 = new ListTableForOfficeArrival();
		panel_4.setOpaque(false);
		tabbedPane.addTab("订单接收", null, panel_4, "订单接收");
		
		JPanel panel_5 = new ListTableForSending();
		panel_5.setOpaque(false);
		tabbedPane.addTab("订单派送", null, panel_5, "订单派送");
		
		JPanel panel_6 = new ListTableForReiceipt();
		panel_6.setOpaque(false);
		tabbedPane.addTab("收款单管理", null, panel_6, "收款单管理");
	}

}

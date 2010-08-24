package org.lcx.robotframework.rcp.part1;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.*;
import org.eclipse.swt.custom.Bullet;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.GlyphMetrics;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

public class View extends ViewPart {
	public static final String ID = "org.lcx.robotframework.rcp.part1.view";

	private TableViewer viewer;
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;

	/**
	 * The content provider class is responsible for providing objects to the
	 * view. It can wrap existing objects in adapters or simply return objects
	 * as-is. These objects may be sensitive to the current input of the view,
	 * or ignore it and always show the same content (like Task List, for
	 * example).
	 */
	class ViewContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}

		public Object[] getElements(Object parent) {
			return new String[] { "One", "Two", "Three" };
		}
	}

	class ViewLabelProvider extends LabelProvider implements
			ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}

		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(
					ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {

		final Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.LEFT, true, true));
		final GridLayout gridLayout = new GridLayout();
		gridLayout.marginBottom = 8;
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		gridLayout.numColumns = 4;
		composite.setLayout(gridLayout);
		
//		createPartTable(composite);
		createPartButton(composite);
		createPartCCombo(composite);
		createPartCheckbox(composite);
		createPartCLabel(composite);
		createPartCTabPanel(composite);
		createPartDateTime(composite);
		createPartLabel(composite);
		createPartLink(composite);
		createPartList(composite);
		createPartRadio(composite);
		createPartSlider(composite);
		createPartSpinner(composite);
		createPartStyledText(composite);
		createPartTabPanel(composite);
		createPartTable2(composite);
		createPartTree(composite);
		createPartTree2(composite);
		createPartToolbar(composite);
		
	}

	public void createPartTable(Composite parent) {
		final Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		final GridLayout gridLayout = new GridLayout();
		gridLayout.marginBottom = 8;
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		gridLayout.numColumns = 2;
		composite.setLayout(gridLayout);

		viewer = new TableViewer(composite, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setInput(getViewSite());
	}	
	
	public void createPartButton(Composite parent) {
		final Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		final GridLayout gridLayout = new GridLayout();
		gridLayout.marginBottom = 8;
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		gridLayout.numColumns = 2;
		composite.setLayout(gridLayout);
		
		button1 = new Button(composite, SWT.PUSH);
		button1.setText("Button 1");
		button1.setToolTipText("tooltip of button 1");
		button1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Button 1 selected");
				changeButton4Visibility();
			}
		});
		
		button2 = new Button(composite, SWT.PUSH);
		button2.setText("Button 2");
		button2.setToolTipText("tooltip of button 2");
		button2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Button 2 selected");
				changeButton4Enabled();
			}
		});
		
		button3 = new Button(composite, SWT.PUSH);
		button3.setText("Button 1");
		button3.setToolTipText("tooltip of button 3");
		button3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Button 3 selected");
				changeButton4Enabled();
			}
		});
		
		button4 = new Button(composite, SWT.PUSH);
		button4.setText("Button 4");
		button4.setToolTipText("tooltip of button 4");
		button4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Button 4 selected");
				changeButton4Enabled();
			}
		});
		button4.setVisible(false);
		button4.setEnabled(false);
	}
	
	public void changeButton4Visibility() {
		button4.setVisible(!button4.isVisible());
	}

	public void changeButton4Enabled() {
		button4.setEnabled(!button4.isEnabled());
	}
	
	public void createPartCCombo(Composite parent) {
		final Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		final GridLayout gridLayout = new GridLayout();
		gridLayout.marginBottom = 8;
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		gridLayout.numColumns = 2;
		composite.setLayout(gridLayout);

		CCombo ccombo = new CCombo(composite, SWT.FLAT | SWT.BORDER);
		ccombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		for (int i = 0; i < 5; i++) {
			ccombo.add("item" + i);
		}
		ccombo.setText("item0");

		ccombo.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Item selected");
			};
		});
		
		Combo combo = new Combo(composite, SWT.FLAT | SWT.BORDER);
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		for (int i = 0; i < 5; i++) {
			combo.add("item" + i);
		}
		combo.setText("item0");

		combo.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Item selected");
			};
		});
	}	

	public void createPartCheckbox(Composite parent) {
		final Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		final GridLayout gridLayout = new GridLayout();
		gridLayout.marginBottom = 8;
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		gridLayout.numColumns = 2;
		composite.setLayout(gridLayout);
		
		Button button1 = new Button(composite, SWT.CHECK);
		button1.setText("Button 1");
		button1.setToolTipText("tooltip of button 1");
		button1.setSelection(true);
		
		button1 = new Button(composite, SWT.CHECK);
		button1.setText("Button 2");
		button1.setToolTipText("tooltip of button 2");
		button1.setSelection(false);

		
	}

	public void createPartCLabel(Composite parent) {
		final Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		final GridLayout gridLayout = new GridLayout();
		gridLayout.marginBottom = 8;
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		gridLayout.numColumns = 2;
		composite.setLayout(gridLayout);
		
		CLabel label1 = new CLabel(composite, SWT.BORDER);
		label1.setText("clabel 1");
		label1.setToolTipText("tooltip clabel 1");
		label1.setAlignment(SWT.RIGHT);
		
		label1 = new CLabel(composite, SWT.BORDER);
		label1.setText("clabel 2");
		label1.setToolTipText("tooltip clabel 2");
		label1.setAlignment(SWT.LEFT);

		label1 = new CLabel(composite, SWT.BORDER);
		label1.setText("clabel 3");
		label1.setToolTipText("tooltip clabel 1");
		label1.setAlignment(SWT.CENTER);

		label1 = new CLabel(composite, SWT.BORDER);
		label1.setText("clabel 4");
		label1.setToolTipText("tooltip clabel 4");
		label1.setAlignment(SWT.CENTER);
		label1.setEnabled(false);
		label1.setVisible(false);
		
	}

	public void createPartCTabPanel(Composite parent) {
		final Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		final GridLayout gridLayout = new GridLayout();
		gridLayout.marginBottom = 8;
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		gridLayout.numColumns = 2;
		composite.setLayout(gridLayout);
		
		CTabFolder folder = new CTabFolder(composite, SWT.BORDER);
		for (int i = 0; i < 4; i++) {
			CTabItem item = new CTabItem(folder, SWT.CLOSE);
			item.setText("Item "+i);
			item.setToolTipText("tooltip Item "+i);
			Text text = new Text(folder, SWT.MULTI);
			text.setText("Content for Item "+i);
			item.setControl(text);
		}
		
	}

	public void createPartTabPanel(Composite parent) {
		final Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		final GridLayout gridLayout = new GridLayout();
		gridLayout.marginBottom = 8;
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		gridLayout.numColumns = 2;
		composite.setLayout(gridLayout);
		
		TabFolder folder = new TabFolder(composite, SWT.BORDER);
		for (int i = 0; i < 4; i++) {
			TabItem item = new TabItem(folder, SWT.CLOSE);
			item.setText("Item "+i);
			item.setToolTipText("tooltip Item "+i);
			Text text = new Text(folder, SWT.MULTI);
			text.setText("Content for Item "+i);
			item.setControl(text);
		}
		
	}

	public void createPartDateTime(Composite parent) {
		final Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		final GridLayout gridLayout = new GridLayout();
		gridLayout.marginBottom = 8;
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		gridLayout.numColumns = 2;
		composite.setLayout(gridLayout);
		
		DateTime calendar = new DateTime (composite, SWT.CALENDAR);
		calendar.setToolTipText("tooltip for calendar");
		calendar.addSelectionListener (new SelectionAdapter () {
			public void widgetSelected (SelectionEvent e) {
				System.out.println ("calendar date changed");
			}
		});

		DateTime time = new DateTime (composite, SWT.TIME);
		time.setToolTipText("tooltip for time");
		time.addSelectionListener (new SelectionAdapter () {
			public void widgetSelected (SelectionEvent e) {
				System.out.println ("time changed");
			}
		});
		
	}
	
	public void createPartLabel(Composite parent) {
		final Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		final GridLayout gridLayout = new GridLayout();
		gridLayout.marginBottom = 8;
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		gridLayout.numColumns = 2;
		composite.setLayout(gridLayout);
		
		Label label1 = new Label(composite, SWT.BORDER);
		label1.setText("label 1");
		label1.setToolTipText("tooltip label 1");
		label1.setAlignment(SWT.RIGHT);
		
		label1 = new Label(composite, SWT.BORDER);
		label1.setText("label 2");
		label1.setToolTipText("tooltip label 2");
		label1.setAlignment(SWT.LEFT);

		label1 = new Label(composite, SWT.BORDER);
		label1.setText("label 3");
		label1.setToolTipText("tooltip label 1");
		label1.setAlignment(SWT.CENTER);

		label1 = new Label(composite, SWT.BORDER);
		label1.setText("label 4");
		label1.setToolTipText("tooltip label 4");
		label1.setAlignment(SWT.CENTER);
		label1.setEnabled(false);
		label1.setVisible(false);
		
	}
	
	public void createPartLink(Composite parent) {
		final Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		final GridLayout gridLayout = new GridLayout();
		gridLayout.marginBottom = 8;
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		gridLayout.numColumns = 2;
		composite.setLayout(gridLayout);
		
		Link label1 = new Link(composite, SWT.BORDER);
		label1.setText("This is a very simple <A>link 1</A> widget");
		label1.setToolTipText("tooltip link 1");
		
		label1 = new Link(composite, SWT.BORDER);
		label1.setText("This is a very simple <A>link 4</A> widge");
		label1.setToolTipText("tooltip link 4");
		label1.setEnabled(false);
		label1.setVisible(false);
		
	}
	
	public void createPartList(Composite parent) {
		final Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		final GridLayout gridLayout = new GridLayout();
		gridLayout.marginBottom = 8;
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		gridLayout.numColumns = 2;
		composite.setLayout(gridLayout);
		
		final List list = new List (composite, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
		for (int i=0; i<10; i++) list.add ("Item " + i);
		list.setToolTipText("tooltip of list");
//		list.setBounds (0, 0, 100, 20);
		list.addListener (SWT.Selection, new Listener () {
			public void handleEvent (Event e) {
				String string = "";
				int [] selection = list.getSelectionIndices ();
				for (int i=0; i<selection.length; i++) string += selection [i] + " ";
				System.out.println ("Selection={" + string + "}");
			}
		});
		list.addListener (SWT.DefaultSelection, new Listener () {
			public void handleEvent (Event e) {
				String string = "";
				int [] selection = list.getSelectionIndices ();
				for (int i=0; i<selection.length; i++) string += selection [i] + " ";
				System.out.println ("DefaultSelection={" + string + "}");
			}
		});
		
	}
	
	public void createPartRadio(Composite parent) {
		final Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		final GridLayout gridLayout = new GridLayout();
		gridLayout.marginBottom = 8;
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		gridLayout.numColumns = 2;
		composite.setLayout(gridLayout);
		
		Button[] radios = new Button[2];

		Button button1 = new Button(composite, SWT.RADIO);
		button1.setText("Radio 1");
		button1.setToolTipText("tooltip of radio 1");
		button1.setSelection(true);
		radios[0] = button1;
		
		button1 = new Button(composite, SWT.RADIO);
		button1.setText("Radio 2");
		button1.setToolTipText("tooltip of radio 2");
		button1.setSelection(false);
		radios[1] = button1;
		
	}

	public void createPartSlider(Composite parent) {
		final Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		final GridLayout gridLayout = new GridLayout();
		gridLayout.marginBottom = 8;
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		gridLayout.numColumns = 2;
		composite.setLayout(gridLayout);
		
		Slider slider = new Slider (composite, SWT.HORIZONTAL);
		slider.setToolTipText("tooltip slider");
		slider.setBounds (10, 10, 200, 32);
		slider.setMaximum(23);
		slider.setMinimum(3);
		slider.setThumb(2);
		slider.setPageIncrement(7);
		slider.addListener (SWT.Selection, new Listener () {
			public void handleEvent (Event event) {
				String string = "SWT.NONE";
				switch (event.detail) {
					case SWT.DRAG: string = "SWT.DRAG"; break;
					case SWT.HOME: string = "SWT.HOME"; break;
					case SWT.END: string = "SWT.END"; break;
					case SWT.ARROW_DOWN: string = "SWT.ARROW_DOWN"; break;
					case SWT.ARROW_UP: string = "SWT.ARROW_UP"; break;
					case SWT.PAGE_DOWN: string = "SWT.PAGE_DOWN"; break;
					case SWT.PAGE_UP: string = "SWT.PAGE_UP"; break;
				}
				System.out.println ("Scroll detail -> " + string);
			}
		});
		
		
	}

	public void createPartSpinner(Composite parent) {
		final Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		final GridLayout gridLayout = new GridLayout();
		gridLayout.marginBottom = 8;
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		gridLayout.numColumns = 2;
		composite.setLayout(gridLayout);
		
		Spinner spinner = new Spinner (composite, SWT.BORDER);
		spinner.setToolTipText("tooltip spinner");
		spinner.setMinimum(0);
		spinner.setMaximum(50);
		spinner.setSelection(25);
		spinner.setIncrement(1);
		spinner.setPageIncrement(10);
		spinner.setDigits(2);
		
	}
	
	public void createPartStyledText(Composite parent) {
		final Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		final GridLayout gridLayout = new GridLayout();
		gridLayout.marginBottom = 8;
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		gridLayout.numColumns = 2;
		composite.setLayout(gridLayout);
		
		StyledText text = new StyledText (composite, SWT.BORDER);
		text.setText("line 1\nline 2\nline 3\nline 4\n");
		text.setToolTipText("tooltip for styled text");
		
		StyleRange style0 = new StyleRange();
		style0.metrics = new GlyphMetrics(0, 0, 40);
		Bullet bullet0 = new Bullet (style0);
		text.setLineBullet(1, 2, bullet0);
		
		Text t = new Text(composite, SWT.BORDER);
		t.setText("this is the text");
		t.setToolTipText("this is the tooltip text");
		
	}

	public void createPartTable2(Composite parent) {
//		final Composite composite = new Composite(parent, SWT.BORDER);
//		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
//		final GridLayout gridLayout = new GridLayout();
//		gridLayout.marginBottom = 8;
//		gridLayout.marginHeight = 0;
//		gridLayout.marginWidth = 0;
//		gridLayout.numColumns = 2;
//		composite.setLayout(gridLayout);
		
		Table table = new Table (parent, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		table.setLinesVisible (true);
		table.setHeaderVisible (true);
		table.setToolTipText("tooltip of table");
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.heightHint = 200;
		data.horizontalSpan = 2;
		table.setLayoutData(data);
		String[] titles = {" ", "C", "!", "Description", "Resource", "In Folder", "Location"};
		for (int i=0; i<titles.length; i++) {
			TableColumn column = new TableColumn (table, SWT.NONE);
			column.setText (titles [i]);
			column.setToolTipText(titles [i]);
		}	
		int count = 128;
		for (int i=0; i<count; i++) {
			TableItem item = new TableItem (table, SWT.NONE);
			item.setText (0, "x");
			item.setText (1, "y");
			item.setText (2, "!");
			item.setText (3, "this stuff behaves the way I expect");
			item.setText (4, "almost everywhere");
			item.setText (5, "some.folder");
			item.setText (6, "line " + i);
		}
		for (int i=0; i<titles.length; i++) {
			table.getColumn (i).pack ();
		}	

		table = new Table (parent, SWT.CHECK | SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		table.setLinesVisible (true);
		table.setHeaderVisible (true);
		table.setToolTipText("tooltip of table");
		data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.heightHint = 200;
		data.horizontalSpan = 2;
		table.setLayoutData(data);
		count = 10;
		for (int i=0; i<count; i++) {
			TableItem item = new TableItem (table, SWT.NONE);
			item.setText ("item " + i);
			if(i%2==0) {
				item.setChecked(true);
			}
		}
//		for (int i=0; i<titles.length; i++) {
//			table.getColumn (i).pack ();
//		}	
		
	}

	
	public void createPartTree(Composite parent) {
//		final Composite composite = new Composite(parent, SWT.BORDER);
//		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
//		final GridLayout gridLayout = new GridLayout();
//		gridLayout.marginBottom = 8;
//		gridLayout.marginHeight = 0;
//		gridLayout.marginWidth = 0;
//		gridLayout.numColumns = 2;
//		composite.setLayout(gridLayout);

		Tree tree = new Tree (parent, SWT.BORDER);
		tree.setToolTipText("tooltip of tree");
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.heightHint = 200;
		data.horizontalSpan = 2;
		tree.setLayoutData(data);
		
		for (int i=0; i<4; i++) {
			TreeItem iItem = new TreeItem (tree, 0);
			iItem.setText ("TreeItem (0) -" + i);
			for (int j=0; j<3; j++) {
				TreeItem jItem = new TreeItem (iItem, 0);
				jItem.setText ("TreeItem (1) -" + j);
				for (int k=0; k<5; k++) {
					TreeItem kItem = new TreeItem (jItem, 0);
					kItem.setText ("TreeItem (2) -" + k);
					for (int l=0; l<6; l++) {
						TreeItem lItem = new TreeItem (kItem, 0);
						lItem.setText ("TreeItem (3) -" + l);
					}
				}
			}
		}

	}

	public void createPartTree2(Composite parent) {
//		final Composite composite = new Composite(parent, SWT.BORDER);
//		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
//		final GridLayout gridLayout = new GridLayout();
//		gridLayout.marginBottom = 8;
//		gridLayout.marginHeight = 0;
//		gridLayout.marginWidth = 0;
//		gridLayout.numColumns = 2;
//		composite.setLayout(gridLayout);

		final Tree tree = new Tree(parent, SWT.BORDER | SWT.CHECK);
		tree.setToolTipText("tooltip of tree");
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.heightHint = 200;
		data.horizontalSpan = 2;
		tree.setLayoutData(data);
		
		tree.setHeaderVisible(true);
		TreeColumn column = new TreeColumn(tree, SWT.LEFT);
		column.setText("Column 0");
		column = new TreeColumn(tree, SWT.CENTER);
		column.setText("Column 1");
		column = new TreeColumn(tree, SWT.LEFT);
		column.setText("Column 2");
		column = new TreeColumn(tree, SWT.RIGHT);
		column.setText("Column 3");
		column = new TreeColumn(tree, SWT.CENTER);
		column.setText("Column 4");
		for (int i = 0; i < 5; i++) {
			TreeItem item = new TreeItem(tree, SWT.NONE);
			String[] text = new String[]{i+":0", i+":1", i+":2", i+":3", i+":4"};
			item.setText(text);
			for (int j = 0; j < 5; j++) {
				TreeItem subItem = new TreeItem(item, SWT.NONE);
				text = new String[]{i+","+j+":0", i+","+j+":1", i+","+j+":2", i+","+j+":3", i+","+j+":4"};
				subItem.setText(text);
				for (int k = 0; k < 5; k++) {
					TreeItem subsubItem = new TreeItem(subItem, SWT.NONE);
					text = new String[]{i+","+j+","+k+":0", i+","+j+","+k+":1", i+","+j+","+k+":2", i+","+j+","+k+":3", i+","+j+","+k+":4"};
					subsubItem.setText(text);
				}
			}
		}
		Listener listener = new Listener() {
			public void handleEvent(Event e) {
				System.out.println("Move "+e.widget);
			}
		};
		TreeColumn[] columns = tree.getColumns();
		for (int i = 0; i < columns.length; i++) {
			columns[i].setWidth(100);
			columns[i].setMoveable(true);
			columns[i].addListener(SWT.Move, listener);
		}		
		
	}
	
	public void createPartToolbar(Composite parent) {
		final ToolBar toolBar = new ToolBar (parent, SWT.BORDER);
		final Menu menu = new Menu (parent.getShell(), SWT.POP_UP);
		for (int i=0; i<8; i++) {
			MenuItem item = new MenuItem (menu, SWT.PUSH);
			item.setText ("Item " + i);
		}
		final ToolItem item = new ToolItem (toolBar, SWT.DROP_DOWN);
		item.setText("drop down");
		item.setToolTipText("tooltip drop down");
		item.addListener (SWT.Selection, new Listener () {
			public void handleEvent (Event event) {
				if (event.detail == SWT.ARROW) {
					Rectangle rect = item.getBounds ();
					Point pt = new Point (rect.x, rect.y + rect.height);
					pt = toolBar.toDisplay (pt);
					menu.setLocation (pt.x, pt.y);
					menu.setVisible (true);
				}
			}
		});
		final ToolItem item2 = new ToolItem (toolBar, SWT.PUSH);
		item2.setText("push");
		item2.setToolTipText("tooltip push");

		final ToolItem item3 = new ToolItem (toolBar, SWT.RADIO);
		item3.setText("radio 1");
		item3.setToolTipText("tooltip radio 1");

		final ToolItem item4 = new ToolItem (toolBar, SWT.RADIO);
		item4.setText("radio 2");
		item4.setToolTipText("tooltip radio 1");

		toolBar.pack ();
	}
	
	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		//viewer.getControl().setFocus();
	}
}
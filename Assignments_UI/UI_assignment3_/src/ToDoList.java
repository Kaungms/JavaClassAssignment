import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDoList extends JFrame implements ActionListener{
    private JTextField taskField;
    private JLabel taskLabel;
    private JButton addButton, removeButton,clearAllButton;
    private JList<String> taskList;
    private DefaultListModel<String>listModel;

    public ToDoList(){
        this.initializeUIComponent();
        this.addUIComponent();
        this.setVisible(true);

    }

//    private void addUIComponent(){
//        this.add(taskField);
//        this.add(addButton);
//        this.add(new JLabel("Task List: "));
//        this.add(new JScrollPane(taskList));
//        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
//        buttonPanel.add(removeButton);
//        buttonPanel.add(clearAllButton);
//        this.add(buttonPanel);
//
//    }

    private void addUIComponent() {
        this.setLayout(new BorderLayout());
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        inputPanel.add(new JLabel("Task:"));
        inputPanel.add(taskField);
        inputPanel.add(addButton);

        JScrollPane taskScrollPane = new JScrollPane(taskList);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.add(removeButton);
        buttonPanel.add(clearAllButton);

        this.add(inputPanel, BorderLayout.NORTH);
        this.add(taskScrollPane, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
    }


    private void initializeUIComponent(){
        this.setTitle("To Do List Manager");
        this.setSize(500,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(5,5,5,5));

        this.taskLabel = new JLabel("Task: ");
        this.taskField = new JTextField(15);
        this.addButton = new JButton("Add Task");
        this.addButton.addActionListener(this);
        this.removeButton = new JButton("Remove Button");
        this.removeButton.addActionListener(this);
        this.clearAllButton = new JButton("Clear All");
        this.clearAllButton.addActionListener(this);

        listModel = new DefaultListModel<>();
        taskList = new JList<>();
        this.taskList.setModel(listModel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.addButton) {
            this.addTaskAction();
        } else if (e.getSource() == this.removeButton) {
            this.removeTaskAction();
        } else if (e.getSource() == this.clearAllButton) {
            this.clearAllAction();
        }
    }

    private void addTaskAction(){
        String task = this.taskField.getText();
        if (!task.isEmpty()){
            listModel.addElement(task);
            taskField.setText("");
        } else {
            JOptionPane.showMessageDialog(this,"PLease enter a task","Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    private void removeTaskAction(){
        int selectedIndex = this.taskList.getSelectedIndex();
        if (selectedIndex != -1) {
            listModel.remove(selectedIndex);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a task to remove.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearAllAction(){
        listModel.clear();
    }
}
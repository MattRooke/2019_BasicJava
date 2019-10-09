package week10;

import javax.swing.*;
import java.awt.*;

public class JavaJuniorCollege {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("UJ - The University of Java");
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setSize(1400, 500);

        JMenuBar menuBar = new JMenuBar();
        mainFrame.add(menuBar, BorderLayout.NORTH);

        JPanel viewPanel = new JPanel();
        viewPanel.setLayout(new GridLayout(0, 1));
        mainFrame.add(viewPanel);

        JLabel title = new JLabel("Welcome");
        title.setFont(new Font("Arial", Font.BOLD, 22));
        viewPanel.add(title);

        JLabel content = new JLabel("This is the University of Java.");
        content.setFont(new Font("Arial", Font.PLAIN, 12));
        viewPanel.add(content);

        JMenu campusMenu = new JMenu("Campuses");
        menuBar.add(campusMenu);

        JMenuItem menuItemCairns = new JMenuItem("Cairns");
        menuItemCairns.addActionListener(e -> {
            title.setText("Cairns Campus");
            content.setText("<html>The campus location is spectacular – surrounded on three sides by rainforest-covered " +
                    "mountains. Located near the northern beaches in the suburb of Smithfield, the campus is 15 " +
                    "kilometres (9 miles) north of the city centre. <br><br>" +
                    "UJ Cairns houses state-of-the-art teaching and research facilities in an attractive setting. " +
                    "Facilities include an impressive library and information technology building, health science " +
                    "and science laboratories, student refectory, café, licensed bar, gym, sporting oval and basketball " +
                    "court.<br><br>" +
                    "With over two million visitors annually, Cairns is one of the most popular tourist destinations " +
                    "in Australia. Attractions include two World Heritage natural environments – the Great Barrier " +
                    "Reef Marine Park and the Wet Tropics ancient rainforests; nearby resort regions include Port " +
                    "Douglas and Mission Beach; the picturesque Atherton Tablelands and outback Queensland are " +
                    "within easy reach.</html>");

        });

        JMenuItem menuItemBrisbane = new JMenuItem("Brisbane");
        menuItemBrisbane.addActionListener(e -> {
            title.setText("Brisbane Campus");
            content.setText("<html>With a modern campus in the heart of the Brisbane central business district, UJ Brisbane " +
                    "offers bachelor degrees and postgraduate programs in business and information technology for " +
                    "international students.<br>" +
                    "<br>" +
                    "Students have access to enhanced job-support services, and clear English language and " +
                    "academic pathways. Students can complete their studies in a shorter time due to the " +
                    "academic calendar of three trimesters per year. Brisbane campus is operated by Russo " +
                    "Higher Education. UJ also has campuses in Cairns, Townsville and Singapore.<br>" +
                    "<br>" +
                    "Brisbane is the capital of Queensland. It is the third largest and fastest growing " +
                    "city in Australia with a population of 2.15 million people. With its subtropical climate," +
                    "good lifestyle, picturesque river precinct, modern shopping, cultural and entertainment " +
                    "options, Brisbane is one of Australia's most liveable cities.</html>");
        });

        JMenuItem menuItemSingapore = new JMenuItem("Singapore");
        menuItemSingapore.addActionListener(e -> {
            title.setText("Singapore Campus");
            content.setText("<html>UJ Singapore was established in 2003 as UJ's first international campus, bringing " +
                    "programs direct from Australia and resident senior academic staff from UJ to ensure academic " +
                    "quality, students studying at UJ Singapore can be assured of the same enriching university " +
                    "education as our students in Queensland Australia.<br>" +
                    "<br>" +
                    "UJ Singapore has achieved the highest level of accreditation from the Singapore Government, " +
                    "the EduTrust Star.<br>" +
                    "<br>" +
                    "Singapore is a distinctive place. With a total land area of just 646 square kilometres, it " +
                    "is a compact country brimming with the vibrancy of over 4 million people.<br>" +
                    "<br>" +
                    "In this country you will find a diverse population of Chinese, Malay, Indian and other " +
                    "ethnic groups, covering a wide spectrum of religions, cultures, and languages, living " +
                    "harmoniously together. The synergistic mix of ethnic groups offers international students " +
                    "a wide spectrum of choices for living and playing in Singapore.<br>" +
                    "<br>" +
                    "Singapore's safety, low crime rates, and high standards of living are well renowned, " +
                    "offering international students an ideal environment for study. When it's time to put " +
                    "away the books, myriad sports, entertainment, and other fascinating sights and sounds " +
                    "are available to relax your mind and fill your senses.<br>" +
                    "<br>" +
                    "Singapore has a warm and humid climate all year-round, with temperatures ranging from 23 " +
                    "to 33 degrees centigrade. Sunshine is the norm, with occasional rain, especially during the " +
                    "year-end periods.</html>");
        });

        campusMenu.add(menuItemCairns);
        campusMenu.add(menuItemBrisbane);
        campusMenu.add(menuItemSingapore);

        JMenu studyMenu = new JMenu("Study");
        menuBar.add(studyMenu);

        JMenuItem menuItemSTEM = new JMenuItem("STEM");
        menuItemSTEM.addActionListener(e -> {
            title.setText("STEM Subjects");
            content.setText("<html>Science , Technology, Engineering & Mathematics</html>");
        });

        JMenuItem menuItemArts = new JMenuItem("Arts");
        menuItemArts.addActionListener(e -> {
            title.setText("Arts Subjects");
            content.setText("<html>Humanities and Arts</html>");
        });

        studyMenu.add(menuItemSTEM);
        studyMenu.add(menuItemArts);

        JMenu activitiesMenu = new JMenu("Activities");
        menuBar.add(activitiesMenu);

        JMenuItem menuItemUniBar = new JMenuItem("Uni Bar");
        menuItemUniBar.addActionListener(e -> {
            title.setText("On Campus Student Bars");
            content.setText("<html>Cheers!</html>");
        });

        JMenuItem menuItemGym = new JMenuItem("Gym");
        menuItemGym.addActionListener(e -> {
            title.setText("University Gyms");
            content.setText("<html>Work Out!</html>");
        });

        activitiesMenu.add(menuItemUniBar);
        activitiesMenu.add(menuItemGym);

        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }
}

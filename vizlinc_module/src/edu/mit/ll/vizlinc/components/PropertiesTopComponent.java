/*
 * 
 */
package edu.mit.ll.vizlinc.components;



import edu.mit.ll.vizlinc.map.ClusterWaypoint;
import edu.mit.ll.vizlinc.model.DBManager;
import edu.mit.ll.vizlinc.model.LocationValue;
import edu.mit.ll.vizlinc.model.PersonValue;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;
import javax.swing.SwingUtilities;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;

/**
 * Top component which displays properties of items selected in the UI
 */
@ConvertAsProperties(
    dtd = "-//edu.mit.ll.vizlinc.components//Properties//EN",
autostore = false)
@TopComponent.Description(
    preferredID = "PropertiesTopComponent",
//iconBase="SET/PATH/TO/ICON/HERE", 
persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "filtersmode", openAtStartup = true)
@ActionID(category = "Window", id = "edu.mit.ll.vizlinc.components.PropertiesTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
    displayName = "#CTL_PropertiesAction",
preferredID = "PropertiesTopComponent")
@Messages({
    "CTL_PropertiesAction=Properties",
    "CTL_PropertiesTopComponent=Properties",
    "HINT_PropertiesTopComponent=This is a Properties window"
})
public final class PropertiesTopComponent extends TopComponent {

    public PropertiesTopComponent() {
        if(!DBManager.getInstance().isReady())
        {
            return;
        }
        initComponents();
        setName(Bundle.CTL_PropertiesTopComponent());
        setToolTipText(Bundle.HINT_PropertiesTopComponent());

        //Clear the panel to show the "no selection" message
        clearGUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        jEditorPane1.setContentType("text/html"); // NOI18N
        jScrollPane3.setViewportView(jEditorPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
    
    public void displayLine(String s)
    {
       jEditorPane1.setText("<html>" + s +"</html>");
    }

    public void showLocationProperties(List<ClusterWaypoint> waypoints)
    {
        StringBuilder sb = new StringBuilder("<html><span style=\"color:black;font-size:14px;font-weight:bold\">");
        //Title
        sb.append("Locations Selected: ").append(waypoints.size()).append("</span>");
        //Locations and corresponding properties
        for (int i = 0; i < waypoints.size(); i++)
        {
            ClusterWaypoint cw = waypoints.get(i);
            sb.append(createLocationPropertiesString(cw, i + 1));
        }
        sb.append("</html>");
        
        this.jEditorPane1.setText(sb.toString());
    }
    
    public void showPersonProperties(Collection<PersonValue> people)
    {
        StringBuilder sb = new StringBuilder("<html><span style=\"color:black;font-size:14px;font-weight:bold\">");
        //Title
        sb.append("Nodes Selected: ").append(people.size()).append("</span>");
        //Display Properties
        int i = 0;
        for(PersonValue person : people)
        {
            sb.append(createPeoplePropertiesString(person, i + 1));
            i++;
        }
        sb.append("</html>");
        
        final String fullText = sb.toString();       
        final PropertiesTopComponent self = this;
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                self.jEditorPane1.setText(fullText);
            }
        });
    }
    
    private String createLocationPropertiesString(ClusterWaypoint cw, int itemNumber)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("<p>");
        sb.append("<span style=\"color:black;font-size:12px\">");
        LocationValue location = cw.getLocationValue();
        String entityName = itemNumber + ") " + location.getText();
        DecimalFormat format = new DecimalFormat("###.##");
        String lat = format.format(cw.getPosition().getLatitude());
        String lon = format.format(cw.getPosition().getLongitude());
        String mentions = String.valueOf(location.getNumMentionsShown());
        String docCount = String.valueOf(location.getNumDocumentsShown());

        //this.titleLabel.setText("Location: " + entityName);

        sb.append(entityName).append("</span><br/>");
        sb.append("<span style=\"font-size:11px\">").append("&nbsp;&nbsp;&nbsp;&nbsp;Lat/Long: ").append(lat).append("/").append(lon).append("<br/>");
        sb.append("&nbsp;&nbsp;&nbsp;&nbsp;Mentions in current document set: ").append(mentions).append("<br/>");
        sb.append("&nbsp;&nbsp;&nbsp;&nbsp;Appears in: ").append(docCount).append(" document(s)</span></p>");
        //sb.append("<p style=\"font-size:12px\">").append("&nbsp;&nbsp;&nbsp;&nbsp;Mentions in current document set: ").append(mentions).append("</p>");
        //sb.append("<p style=\"font-size:12px\">").append("&nbsp;&nbsp;&nbsp;&nbsp;Appears in: ").append(docCount).append(" document(s)</p>");
        
        return sb.toString();
    }

    private void clearGUI()
    {
        jEditorPane1.setText("<html><span style=\\\"color:black;font-size:12px\\\">No Selection");
        //showLocationProperties(new ArrayList<ClusterWaypoint>(0));
        
    }

    private String createPeoplePropertiesString(PersonValue p, int i)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("<p>");
        sb.append("<span style=\"color:black;font-size:12px\">");
        sb.append(i).append(") ").append(p.getText());
        sb.append("</span><br/>");
        sb.append("<span style=\"font-size:11px\">");
        sb.append("&nbsp;&nbsp;&nbsp;&nbsp;Mentions in current document set: ").append(p.getNumMentionsShown()).append("<br/>");
        sb.append("&nbsp;&nbsp;&nbsp;&nbsp;Appears in: ").append(p.getNumDocumentsShown()).append(" document(s)</span></p>");
        
        return sb.toString();
    }
}
package org.lcx.robotframework.ant;

import java.io.File;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.taskdefs.Java;
import org.apache.tools.ant.types.Path;

public class RobotAnt extends Java {
	
	public final static String RFJAR	= Messages.getString("rfjar"); //$NON-NLS-1$
	public final static String RFCLASS	= Messages.getString("rfclass"); //$NON-NLS-1$
	
	private boolean localfork			= false;
	private boolean forkreceived		= false;
	
	private String data_sources			= null;
	private String name					= null;
	private String suite				= null;
	private String test					= null;
	private String outputdir			= null;
	private String loglevel				= null;
	private String debugfile			= null;
	private String variablefile			= null;
	
	
	public RobotAnt() {
		super();
	}

	public RobotAnt(Task owner) {
		super(owner);
	}
	
    /**
     * Do the execution.
     * @throws BuildException if failOnError is set to true and the application
     * returns a nonzero result code.
     */
	@Override
	public void execute() throws BuildException {
		this.setArguments();
		super.execute();
	}
	
	/**
	 * Set the RF parameters from the given ant parameters 
	 */
	protected void setArguments() throws BuildException {

		// set rf jar if given as argument
		// if jar is given force fork to use external VM
        if (getCommandLine().getClassname() != null) {
            throw new BuildException("Cannot set 'classname' attribute in robotframework task.");
        }
        
        if (forkreceived && !localfork && getCommandLine().getJar() != null) {
            throw new BuildException("Cannot execute a jar in non-forked mode."
                                     + " Please set fork='true'. ");
        }

        if(!forkreceived && this.getCommandLine().getJar()!=null) {
			this.setLocalFork(true);
		}
		
		if(!forkreceived && this.getCommandLine().getJar()==null && 
				this.getCommandLine().getClassname()==null) {
			this.setJar(new File(RFJAR));
			this.setLocalFork(true);
		}
		
		if(forkreceived && localfork && this.getCommandLine().getJar()==null && 
				this.getCommandLine().getClassname()==null) {
			this.setJar(new File(RFJAR));
		}

		if(forkreceived && !localfork && this.getCommandLine().getClassname()==null) {
			this.setClassname(RFCLASS);
			Path p = new Path(this.getProject(), RFJAR);
			this.createClasspath().append(p);
		}
	
		if(getName()!=null && getName().trim().length() >0 ){
			this.createArg("name", getName());
		}

		if(getVariablefile()!=null && getVariablefile().trim().length() >0 ){
			this.createArg("variablefile", getVariablefile());
		}

		if(getLoglevel()!=null && getLoglevel().trim().length() >0 ){
			this.createArg("loglevel", getLoglevel());
		}

		if(getDebugfile()!=null && getDebugfile().trim().length() >0) {
			this.createArg("debugfile", getDebugfile());
		}

		if(getOutputdir()!=null && getOutputdir().trim().length() >0) {
			this.createArg("outputdir", getOutputdir());
		}

		if(getSuite()!=null && getSuite().trim().length() >0) {
			this.createArg("suite", getSuite());
		}

		if(getTest()!=null && getTest().trim().length() >0) {
			this.createArg("test", getTest());
		}

		// always at the end for data_sources
		if(getData_sources()!=null) {
			this.getCommandLine().createArgument().setLine(getData_sources());
		}
	}
	
	/**
	 * Create an argument in the command line for given key and value
	 * @param key
	 * @param value
	 */
	protected void createArg(String key, String value) {
		this.getCommandLine().createArgument().setLine(Messages.getString(key)+" "+value);
	}

    /**
     * Accessor to the data sources to use.
     *
     * @return the robotframework standealone jar file to use.
     * 
     */
	public String getData_sources() {
		return data_sources;
	}

    /**
     * Set the data sources to use.
     *
     * @param the data sources to use.
     *
     */
	public void setData_sources(String dataSources) {
		data_sources = dataSources;
	}

	/**
	 * Accessor to the suite parameter
	 * @return the suite
	 */
	public String getSuite() {
		return suite;
	}

	/**
	 * Set the test suites to run by name
	 * @param suite the suite to set
	 */
	public void setSuite(String suite) {
		this.suite = suite;
	}

	/**
	 * Accesor to test parameter
	 * @return the test
	 */
	public String getTest() {
		return test;
	}

	/**
	 * Set test cases to run by name
	 * @param test the test to set
	 */
	public void setTest(String test) {
		this.test = test;
	}

	/**
	 * Accessor to the outputdir parameter
	 * @return the outputdir
	 */
	public String getOutputdir() {
		return outputdir;
	}

	/**
	 * Set where to create output files
	 * @param outputdir the outputdir to set
	 */
	public void setOutputdir(String outputdir) {
		this.outputdir = outputdir;
	}

	/**
	 * Accessor to the loglevel parameter
	 * @return the loglevel
	 */
	public String getLoglevel() {
		return loglevel;
	}

	/**
	 * Set the threshold level for logging. Available levels:
	 * 		TRACE, DEBUG, INFO (default), WARN, NONE (no logging)
	 * @param loglevel the loglevel to set
	 */
	public void setLoglevel(String loglevel) {
		this.loglevel = loglevel;
	}

	/**
	 * Accessor to the debugfile parameter
	 * @return the debugfile
	 */
	public String getDebugfile() {
		return debugfile;
	}

	/**
	 * Set the debug file written during execution
	 * @param debugfile the debugfile to set
	 */
	public void setDebugfile(String debugfile) {
		this.debugfile = debugfile;
	}

	/**
	 * Accessor to the name parameter
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the top level test suite
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Accessor to the variablefile parameter
	 * @return the variablefile
	 */
	public String getVariablefile() {
		return variablefile;
	}

	/**
	 * Set the file to read variables from (e.g. 'path/vars.py').
	 * @param variablefile the variablefile to set
	 */
	public void setVariablefile(String variablefile) {
		this.variablefile = variablefile;
	}

    /**
     * If true, execute in a new VM.
     *
     * @param s do you want to run Java in a new VM.
     */
	@Override
    public void setFork(boolean s) throws BuildException {
		forkreceived=true;
		localfork=s;
        super.setFork(s);
    }

	/**
	 * set local fork
	 * @return
	 */
	private void setLocalFork(boolean s) {
		localfork=s;
        super.setFork(s);
	}

	/**
	 * Is process is fork
	 * Method is public for unit test
	 * @return
	 */
	public boolean isLocalFork() {
		return localfork;
	}
		
}

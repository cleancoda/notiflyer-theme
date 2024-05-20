/**
 * 
MIT License

Copyright (c) 2024 cleancoda

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE. 
*/

package org.notiflyer.controller.util;

// import statements
import java.awt.Dimension; // size of the host machine resolution
import java.awt.Toolkit; // api to fetch host information

/**
 * This class is used to interact with the host machine
 * @author anon
 */
public class HostMachineAPI {

    // class variables
    private String hostName;
    private double hostWidth;
    private double hostHeight;
    private Dimension hostScreenSize;

    /**
     * Default constructor
     */
    public HostMachineAPI() {
    }

    /**
     * fetches and sets the current host resolution size in variables
     * 
     */
    private void setHostScreenSize() {
        this.hostHeight = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        this.hostWidth = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        this.hostScreenSize = new Dimension((int) this.hostWidth, (int) this.hostHeight);
    }

    /**
     * fetches and sets the current host window resolution size in variables
     * @return Dimension object containing the host resolution
     */
    public Dimension getHostScreenSize() {
        // fetch the host screen size
        setHostScreenSize();
        this.hostScreenSize = new Dimension((int) this.hostWidth, (int) this.hostHeight);
        return this.hostScreenSize;
    }

    /**
     * fetches and sets the current host window resolution size in variables
     * scales down by 25% to reduce the size of the application window
     * @return Dimension object containing the reduced host resolution
     */
    public Dimension getReducedScreenSize() {
        // fetch the host screen size
        setHostScreenSize();
        // reduce the size of the host screen by 25%
        this.hostHeight = this.hostHeight * 0.85;
        this.hostWidth = this.hostWidth * 0.85;
        this.hostScreenSize = new Dimension((int) this.hostWidth, (int) this.hostHeight);
        return this.hostScreenSize;
    }

}

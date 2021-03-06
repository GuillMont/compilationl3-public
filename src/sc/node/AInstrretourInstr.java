/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class AInstrretourInstr extends PInstr
{
    private PInstrretour _instrretour_;

    public AInstrretourInstr()
    {
        // Constructor
    }

    public AInstrretourInstr(
        @SuppressWarnings("hiding") PInstrretour _instrretour_)
    {
        // Constructor
        setInstrretour(_instrretour_);

    }

    @Override
    public Object clone()
    {
        return new AInstrretourInstr(
            cloneNode(this._instrretour_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInstrretourInstr(this);
    }

    public PInstrretour getInstrretour()
    {
        return this._instrretour_;
    }

    public void setInstrretour(PInstrretour node)
    {
        if(this._instrretour_ != null)
        {
            this._instrretour_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._instrretour_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._instrretour_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._instrretour_ == child)
        {
            this._instrretour_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._instrretour_ == oldChild)
        {
            setInstrretour((PInstrretour) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

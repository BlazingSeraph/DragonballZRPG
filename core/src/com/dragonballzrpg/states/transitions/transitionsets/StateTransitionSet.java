package com.dragonballzrpg.states.transitions.transitionsets;

import com.dragonballzrpg.states.State;
import com.dragonballzrpg.states.inputhandlerstates.NotHandlingInputState;
import com.dragonballzrpg.states.transitions.Transition;
import com.dragonballzrpg.states.transitions.TransitionCondition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Carl on 29/07/2017.
 */

public abstract class StateTransitionSet
{
    protected List<Transition> transitions;
    protected List<TransitionCondition> transitionConditions;

    public StateTransitionSet()
    {
        transitions = new ArrayList<Transition>();
        transitionConditions = new ArrayList<TransitionCondition>();
    }

    public State checkTransitions(State state)
    {
        for(Transition transition : transitions)
        {
            state = transition.update(state);
        }

        return state;
    }
}

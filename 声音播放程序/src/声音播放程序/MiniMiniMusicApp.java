package �������ų���;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class MiniMiniMusicApp {
	public static void main(String[] args) {
		MiniMiniMusicApp mini = new MiniMiniMusicApp();
		mini.play();
	}

	public void play() {
		// TODO Auto-generated method stub
		try {
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();

			ShortMessage a = new ShortMessage();
			a.setMessage(144, 2, 50, 100);
			MidiEvent noteOn = new MidiEvent(a, 1);
			track.add(noteOn);

			ShortMessage b = new ShortMessage();
			b.setMessage(128, 1, 44, 100);
			MidiEvent noteOff = new MidiEvent(b, 58);
			track.add(noteOff);

			player.setSequence(seq);

			player.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

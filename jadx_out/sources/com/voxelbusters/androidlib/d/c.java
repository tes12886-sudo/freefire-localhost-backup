package com.voxelbusters.androidlib.d;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import android.util.Log;
import com.voxelbusters.androidlib.c.g;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private static String a = "MediaMuxerHelper";

    public static boolean a(String str, String str2, String str3, int i2, float f, g gVar) {
        String str4;
        int iAddTrack;
        int integer;
        long j2;
        int iAddTrack2;
        long j3;
        int i3;
        int i4;
        String str5 = str2;
        String str6 = str3;
        try {
            try {
                if (!b.m(str)) {
                    try {
                        if (!b.m(str2) && !b.m(str3)) {
                            if (Build.VERSION.SDK_INT < 18) {
                                if (gVar != null) {
                                    gVar.onMuxerEnd();
                                }
                                File file = new File(str5);
                                if (file.exists()) {
                                    file.delete();
                                }
                                File file2 = new File(str6);
                                if (file2.exists()) {
                                    file2.delete();
                                }
                                return false;
                            }
                            Log.d(a, "muxerVideoAudio: video->" + str + "  audio->" + str5 + "  out->" + str6 + " videoBitRate->" + i2 + "  videoFrameRate->" + f);
                            if (gVar != null) {
                                gVar.onMuxerStart();
                            }
                            MediaMuxer mediaMuxer = new MediaMuxer(str6, 0);
                            MediaExtractor mediaExtractor = new MediaExtractor();
                            mediaExtractor.setDataSource(str);
                            MediaExtractor mediaExtractor2 = new MediaExtractor();
                            mediaExtractor2.setDataSource(str5);
                            int i5 = 0;
                            while (true) {
                                str4 = "mime";
                                if (i5 >= mediaExtractor.getTrackCount()) {
                                    iAddTrack = -1;
                                    integer = 0;
                                    j2 = 0;
                                    break;
                                }
                                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i5);
                                if (trackFormat.getString("mime").startsWith("video/")) {
                                    if (i2 > 0) {
                                        trackFormat.setInteger("bitrate", i2);
                                    }
                                    if (f > 0.0f) {
                                        trackFormat.setFloat("frame-rate", f);
                                    }
                                    mediaExtractor.selectTrack(i5);
                                    iAddTrack = mediaMuxer.addTrack(trackFormat);
                                    j2 = trackFormat.getLong("durationUs");
                                    integer = trackFormat.getInteger("max-input-size");
                                    break;
                                }
                                i5++;
                            }
                            if (integer == 0) {
                                integer = 1048576;
                            }
                            int i6 = 0;
                            while (true) {
                                if (i6 >= mediaExtractor2.getTrackCount()) {
                                    iAddTrack2 = -1;
                                    j3 = 0;
                                    break;
                                }
                                MediaFormat trackFormat2 = mediaExtractor2.getTrackFormat(i6);
                                String str7 = str4;
                                if (trackFormat2.getString(str4).startsWith("audio/")) {
                                    mediaExtractor2.selectTrack(i6);
                                    iAddTrack2 = mediaMuxer.addTrack(trackFormat2);
                                    j3 = trackFormat2.getLong("durationUs");
                                    break;
                                }
                                i6++;
                                str4 = str7;
                            }
                            Log.d(a, "muxerVideoAudio: videoTrackIndex = " + iAddTrack + "  audioTrackIndex = " + iAddTrack2);
                            if (j2 <= 0) {
                                j2 = 1;
                            }
                            if (j3 <= 0) {
                                j3 = 1;
                            }
                            mediaMuxer.start();
                            if (-1 != iAddTrack) {
                                try {
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    bufferInfo.presentationTimeUs = 0L;
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(integer);
                                    i3 = 0;
                                    while (true) {
                                        int sampleData = mediaExtractor.readSampleData(byteBufferAllocate, 0);
                                        if (sampleData < 0) {
                                            break;
                                        }
                                        bufferInfo.offset = 0;
                                        bufferInfo.size = sampleData;
                                        bufferInfo.flags = mediaExtractor.getSampleFlags();
                                        bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                                        mediaMuxer.writeSampleData(iAddTrack, byteBufferAllocate, bufferInfo);
                                        double d = bufferInfo.presentationTimeUs;
                                        MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
                                        int i7 = iAddTrack;
                                        double d2 = j2;
                                        Double.isNaN(d);
                                        Double.isNaN(d2);
                                        int iRound = (int) Math.round((d / d2) * 0.5d * 100.0d);
                                        if (iRound > i3) {
                                            if (gVar != null) {
                                                gVar.onMuxerProgress(iRound);
                                            }
                                            i3 = iRound;
                                        }
                                        mediaExtractor.advance();
                                        bufferInfo = bufferInfo2;
                                        iAddTrack = i7;
                                    }
                                    i4 = -1;
                                } catch (Exception e) {
                                    e = e;
                                    str5 = str2;
                                } catch (Throwable unused) {
                                    str5 = str2;
                                    str6 = str3;
                                    if (gVar != null) {
                                        gVar.onMuxerEnd();
                                    }
                                    File file3 = new File(str5);
                                    if (file3.exists()) {
                                        file3.delete();
                                    }
                                    File file4 = new File(str6);
                                    if (!file4.exists()) {
                                        return false;
                                    }
                                    file4.delete();
                                    return false;
                                }
                            } else {
                                i4 = -1;
                                i3 = 0;
                            }
                            if (i4 != iAddTrack2) {
                                MediaCodec.BufferInfo bufferInfo3 = new MediaCodec.BufferInfo();
                                bufferInfo3.presentationTimeUs = 0L;
                                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(1048576);
                                while (true) {
                                    int sampleData2 = mediaExtractor2.readSampleData(byteBufferAllocate2, 0);
                                    if (sampleData2 < 0) {
                                        break;
                                    }
                                    bufferInfo3.offset = 0;
                                    bufferInfo3.size = sampleData2;
                                    bufferInfo3.flags = mediaExtractor2.getSampleFlags();
                                    bufferInfo3.presentationTimeUs = mediaExtractor2.getSampleTime();
                                    mediaMuxer.writeSampleData(iAddTrack2, byteBufferAllocate2, bufferInfo3);
                                    double d3 = bufferInfo3.presentationTimeUs;
                                    double d4 = j3;
                                    Double.isNaN(d3);
                                    Double.isNaN(d4);
                                    int iRound2 = ((int) Math.round((d3 / d4) * 0.5d * 100.0d)) + 50;
                                    if (iRound2 > i3) {
                                        if (gVar != null) {
                                            gVar.onMuxerProgress(iRound2);
                                        }
                                        i3 = iRound2;
                                    }
                                    mediaExtractor2.advance();
                                }
                            }
                            if (gVar != null) {
                                gVar.onMuxerProgress(100);
                            }
                            mediaExtractor.release();
                            mediaExtractor2.release();
                            mediaMuxer.stop();
                            mediaMuxer.release();
                            if (gVar != null) {
                                gVar.onMuxerEnd();
                            }
                            File file5 = new File(str2);
                            if (file5.exists()) {
                                file5.delete();
                            }
                            File file6 = new File(str);
                            if (!file6.exists()) {
                                return true;
                            }
                            file6.delete();
                            return true;
                            str6 = str3;
                            e.printStackTrace();
                            if (gVar != null) {
                                gVar.onMuxerEnd();
                            }
                            File file7 = new File(str5);
                            if (file7.exists()) {
                                file7.delete();
                            }
                            File file8 = new File(str6);
                            if (!file8.exists()) {
                                return false;
                            }
                            file8.delete();
                            return false;
                        }
                    } catch (Exception e2) {
                        e = e2;
                    } catch (Throwable unused2) {
                    }
                }
                if (gVar != null) {
                    gVar.onMuxerEnd();
                }
                File file9 = new File(str5);
                if (file9.exists()) {
                    file9.delete();
                }
                File file10 = new File(str3);
                if (!file10.exists()) {
                    return false;
                }
                file10.delete();
                return false;
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable unused3) {
        }
    }
}

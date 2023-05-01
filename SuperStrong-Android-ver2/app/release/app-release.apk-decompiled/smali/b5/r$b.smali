.class public final Lb5/r$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb5/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final b:Lf5/e;

.field public final c:Lf5/e;

.field public final d:J

.field public e:Z

.field public f:Z

.field public final synthetic g:Lb5/r;


# direct methods
.method public constructor <init>(Lb5/r;J)V
    .locals 0

    iput-object p1, p0, Lb5/r$b;->g:Lb5/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lf5/e;

    invoke-direct {p1}, Lf5/e;-><init>()V

    iput-object p1, p0, Lb5/r$b;->b:Lf5/e;

    new-instance p1, Lf5/e;

    invoke-direct {p1}, Lf5/e;-><init>()V

    iput-object p1, p0, Lb5/r$b;->c:Lf5/e;

    iput-wide p2, p0, Lb5/r$b;->d:J

    return-void
.end method


# virtual methods
.method public final B(Lf5/e;J)J
    .locals 12

    .line 1
    :goto_0
    iget-object p2, p0, Lb5/r$b;->g:Lb5/r;

    .line 2
    .line 3
    monitor-enter p2

    .line 4
    :try_start_0
    iget-object p3, p0, Lb5/r$b;->g:Lb5/r;

    .line 5
    .line 6
    iget-object p3, p3, Lb5/r;->i:Lb5/r$c;

    .line 7
    .line 8
    invoke-virtual {p3}, Lf5/c;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    .line 11
    :try_start_1
    iget-object p3, p0, Lb5/r$b;->g:Lb5/r;

    .line 12
    .line 13
    iget v0, p3, Lb5/r;->k:I

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object p3, p3, Lb5/r;->l:Ljava/io/IOException;

    .line 18
    .line 19
    if-eqz p3, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    new-instance p3, Lb5/v;

    .line 23
    .line 24
    iget-object v0, p0, Lb5/r$b;->g:Lb5/r;

    .line 25
    .line 26
    iget v0, v0, Lb5/r;->k:I

    .line 27
    .line 28
    invoke-direct {p3, v0}, Lb5/v;-><init>(I)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/4 p3, 0x0

    .line 33
    :goto_1
    iget-boolean v0, p0, Lb5/r$b;->e:Z

    .line 34
    .line 35
    if-nez v0, :cond_7

    .line 36
    .line 37
    iget-object v0, p0, Lb5/r$b;->c:Lf5/e;

    .line 38
    .line 39
    iget-wide v1, v0, Lf5/e;->c:J

    .line 40
    .line 41
    const-wide/16 v3, 0x0

    .line 42
    .line 43
    cmp-long v5, v1, v3

    .line 44
    .line 45
    const-wide/16 v6, -0x1

    .line 46
    .line 47
    if-lez v5, :cond_2

    .line 48
    .line 49
    const-wide/16 v8, 0x2000

    .line 50
    .line 51
    invoke-static {v8, v9, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    invoke-virtual {v0, p1, v1, v2}, Lf5/e;->B(Lf5/e;J)J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    iget-object p1, p0, Lb5/r$b;->g:Lb5/r;

    .line 60
    .line 61
    iget-wide v8, p1, Lb5/r;->a:J

    .line 62
    .line 63
    add-long/2addr v8, v0

    .line 64
    iput-wide v8, p1, Lb5/r;->a:J

    .line 65
    .line 66
    if-nez p3, :cond_4

    .line 67
    .line 68
    iget-object p1, p1, Lb5/r;->d:Lb5/g;

    .line 69
    .line 70
    iget-object p1, p1, Lb5/g;->s:Le0/e;

    .line 71
    .line 72
    invoke-virtual {p1}, Le0/e;->c()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    div-int/lit8 p1, p1, 0x2

    .line 77
    .line 78
    int-to-long v10, p1

    .line 79
    cmp-long p1, v8, v10

    .line 80
    .line 81
    if-ltz p1, :cond_4

    .line 82
    .line 83
    iget-object p1, p0, Lb5/r$b;->g:Lb5/r;

    .line 84
    .line 85
    iget-object v2, p1, Lb5/r;->d:Lb5/g;

    .line 86
    .line 87
    iget v5, p1, Lb5/r;->c:I

    .line 88
    .line 89
    iget-wide v8, p1, Lb5/r;->a:J

    .line 90
    .line 91
    invoke-virtual {v2, v5, v8, v9}, Lb5/g;->r(IJ)V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Lb5/r$b;->g:Lb5/r;

    .line 95
    .line 96
    iput-wide v3, p1, Lb5/r;->a:J

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    iget-boolean v0, p0, Lb5/r$b;->f:Z

    .line 100
    .line 101
    if-nez v0, :cond_3

    .line 102
    .line 103
    if-nez p3, :cond_3

    .line 104
    .line 105
    iget-object p3, p0, Lb5/r$b;->g:Lb5/r;

    .line 106
    .line 107
    invoke-virtual {p3}, Lb5/r;->i()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    .line 109
    .line 110
    :try_start_2
    iget-object p3, p0, Lb5/r$b;->g:Lb5/r;

    .line 111
    .line 112
    iget-object p3, p3, Lb5/r;->i:Lb5/r$c;

    .line 113
    .line 114
    invoke-virtual {p3}, Lb5/r$c;->o()V

    .line 115
    .line 116
    .line 117
    monitor-exit p2

    .line 118
    goto :goto_0

    .line 119
    :cond_3
    move-wide v0, v6

    .line 120
    :cond_4
    :goto_2
    iget-object p1, p0, Lb5/r$b;->g:Lb5/r;

    .line 121
    .line 122
    iget-object p1, p1, Lb5/r;->i:Lb5/r$c;

    .line 123
    .line 124
    invoke-virtual {p1}, Lb5/r$c;->o()V

    .line 125
    .line 126
    .line 127
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 128
    cmp-long p1, v0, v6

    .line 129
    .line 130
    if-eqz p1, :cond_5

    .line 131
    .line 132
    iget-object p1, p0, Lb5/r$b;->g:Lb5/r;

    .line 133
    .line 134
    iget-object p1, p1, Lb5/r;->d:Lb5/g;

    .line 135
    .line 136
    invoke-virtual {p1, v0, v1}, Lb5/g;->o(J)V

    .line 137
    .line 138
    .line 139
    return-wide v0

    .line 140
    :cond_5
    if-nez p3, :cond_6

    .line 141
    .line 142
    return-wide v6

    .line 143
    :cond_6
    throw p3

    .line 144
    :cond_7
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    .line 145
    .line 146
    const-string p3, "stream closed"

    .line 147
    .line 148
    invoke-direct {p1, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 152
    :catchall_0
    move-exception p1

    .line 153
    :try_start_4
    iget-object p3, p0, Lb5/r$b;->g:Lb5/r;

    .line 154
    .line 155
    iget-object p3, p3, Lb5/r;->i:Lb5/r$c;

    .line 156
    .line 157
    invoke-virtual {p3}, Lb5/r$c;->o()V

    .line 158
    .line 159
    .line 160
    throw p1

    .line 161
    :catchall_1
    move-exception p1

    .line 162
    monitor-exit p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 163
    throw p1
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
.end method

.method public final b()Lf5/z;
    .locals 1

    iget-object v0, p0, Lb5/r$b;->g:Lb5/r;

    iget-object v0, v0, Lb5/r;->i:Lb5/r$c;

    return-object v0
.end method

.method public final close()V
    .locals 4

    .line 1
    iget-object v0, p0, Lb5/r$b;->g:Lb5/r;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lb5/r$b;->e:Z

    .line 6
    .line 7
    iget-object v1, p0, Lb5/r$b;->c:Lf5/e;

    .line 8
    .line 9
    iget-wide v2, v1, Lf5/e;->c:J

    .line 10
    .line 11
    invoke-virtual {v1}, Lf5/e;->c()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lb5/r$b;->g:Lb5/r;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 17
    .line 18
    .line 19
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    const-wide/16 v0, 0x0

    .line 21
    .line 22
    cmp-long v0, v2, v0

    .line 23
    .line 24
    if-lez v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lb5/r$b;->g:Lb5/r;

    .line 27
    .line 28
    iget-object v0, v0, Lb5/r;->d:Lb5/g;

    .line 29
    .line 30
    invoke-virtual {v0, v2, v3}, Lb5/g;->o(J)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, Lb5/r$b;->g:Lb5/r;

    .line 34
    .line 35
    invoke-virtual {v0}, Lb5/r;->a()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception v1

    .line 40
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    throw v1
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

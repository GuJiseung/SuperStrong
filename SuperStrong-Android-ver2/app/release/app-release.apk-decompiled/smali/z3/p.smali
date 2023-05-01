.class public final Lz3/p;
.super Lz3/o;
.source "SourceFile"


# static fields
.field public static final z:Landroid/util/SparseIntArray;


# instance fields
.field public y:J


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lz3/p;->z:Landroid/util/SparseIntArray;

    const v1, 0x7f09017a

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f090248

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f090066

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f09024f

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f090249

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f09012c

    const/4 v2, 0x6

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f0901b7

    const/4 v2, 0x7

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f090107

    const/16 v2, 0x8

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f090111

    const/16 v2, 0x9

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f09022e

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f090113

    const/16 v2, 0xb

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f09022f

    const/16 v2, 0xc

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f090112

    const/16 v2, 0xd

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f090230

    const/16 v2, 0xe

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f090217

    const/16 v2, 0xf

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f090262

    const/16 v2, 0x10

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/b;Landroid/view/View;)V
    .locals 12

    .line 1
    sget-object v0, Lz3/p;->z:Landroid/util/SparseIntArray;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-static {p2, v1, v0}, Landroidx/databinding/ViewDataBinding;->u(Landroid/view/View;ILandroid/util/SparseIntArray;)[Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x3

    .line 10
    aget-object v1, v0, v1

    .line 11
    .line 12
    check-cast v1, Landroid/widget/ImageView;

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    aget-object v1, v0, v1

    .line 17
    .line 18
    check-cast v1, Landroid/widget/ImageView;

    .line 19
    .line 20
    const/16 v1, 0x9

    .line 21
    .line 22
    aget-object v1, v0, v1

    .line 23
    .line 24
    move-object v5, v1

    .line 25
    check-cast v5, Landroid/widget/ImageView;

    .line 26
    .line 27
    const/16 v1, 0xd

    .line 28
    .line 29
    aget-object v1, v0, v1

    .line 30
    .line 31
    move-object v6, v1

    .line 32
    check-cast v6, Landroid/widget/ImageView;

    .line 33
    .line 34
    const/16 v1, 0xb

    .line 35
    .line 36
    aget-object v1, v0, v1

    .line 37
    .line 38
    move-object v7, v1

    .line 39
    check-cast v7, Landroid/widget/ImageView;

    .line 40
    .line 41
    const/4 v1, 0x6

    .line 42
    aget-object v1, v0, v1

    .line 43
    .line 44
    check-cast v1, Landroid/widget/LinearLayout;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    aget-object v1, v0, v1

    .line 48
    .line 49
    check-cast v1, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 50
    .line 51
    const/4 v1, 0x7

    .line 52
    aget-object v1, v0, v1

    .line 53
    .line 54
    move-object v8, v1

    .line 55
    check-cast v8, Landroid/widget/TextView;

    .line 56
    .line 57
    const/16 v1, 0xf

    .line 58
    .line 59
    aget-object v1, v0, v1

    .line 60
    .line 61
    move-object v9, v1

    .line 62
    check-cast v9, Lcom/google/android/material/tabs/TabLayout;

    .line 63
    .line 64
    const/16 v1, 0xa

    .line 65
    .line 66
    aget-object v1, v0, v1

    .line 67
    .line 68
    check-cast v1, Landroid/widget/TextView;

    .line 69
    .line 70
    const/16 v1, 0xc

    .line 71
    .line 72
    aget-object v1, v0, v1

    .line 73
    .line 74
    check-cast v1, Landroid/widget/TextView;

    .line 75
    .line 76
    const/16 v1, 0xe

    .line 77
    .line 78
    aget-object v1, v0, v1

    .line 79
    .line 80
    check-cast v1, Landroid/widget/TextView;

    .line 81
    .line 82
    const/4 v1, 0x2

    .line 83
    aget-object v1, v0, v1

    .line 84
    .line 85
    check-cast v1, Landroidx/appcompat/widget/Toolbar;

    .line 86
    .line 87
    const/4 v1, 0x5

    .line 88
    aget-object v1, v0, v1

    .line 89
    .line 90
    check-cast v1, Landroid/view/View;

    .line 91
    .line 92
    const/4 v1, 0x4

    .line 93
    aget-object v1, v0, v1

    .line 94
    .line 95
    move-object v10, v1

    .line 96
    check-cast v10, Landroid/widget/TextView;

    .line 97
    .line 98
    const/16 v1, 0x10

    .line 99
    .line 100
    aget-object v1, v0, v1

    .line 101
    .line 102
    move-object v11, v1

    .line 103
    check-cast v11, Landroidx/viewpager2/widget/ViewPager2;

    .line 104
    .line 105
    move-object v2, p0

    .line 106
    move-object v3, p1

    .line 107
    move-object v4, p2

    .line 108
    invoke-direct/range {v2 .. v11}, Lz3/o;-><init>(Ljava/lang/Object;Landroid/view/View;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Lcom/google/android/material/tabs/TabLayout;Landroid/widget/TextView;Landroidx/viewpager2/widget/ViewPager2;)V

    .line 109
    .line 110
    .line 111
    const-wide/16 v1, -0x1

    .line 112
    .line 113
    iput-wide v1, p0, Lz3/p;->y:J

    .line 114
    .line 115
    const/4 p1, 0x0

    .line 116
    aget-object p1, v0, p1

    .line 117
    .line 118
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 119
    .line 120
    const/4 v0, 0x0

    .line 121
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    const p1, 0x7f0900ae

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2, p1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    monitor-enter p0

    .line 131
    const-wide/16 p1, 0x2

    .line 132
    .line 133
    :try_start_0
    iput-wide p1, p0, Lz3/p;->y:J

    .line 134
    .line 135
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->v()V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :catchall_0
    move-exception p1

    .line 141
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 142
    throw p1
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


# virtual methods
.method public final q()V
    .locals 2

    monitor-enter p0

    const-wide/16 v0, 0x0

    :try_start_0
    iput-wide v0, p0, Lz3/p;->y:J

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final r()Z
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lz3/p;->y:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    monitor-exit p0

    const/4 v0, 0x1

    return v0

    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final x()V
    .locals 0

    return-void
.end method

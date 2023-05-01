.class public final Lo1/e$b;
.super Lo1/e$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo1/e$a<",
        "Landroid/os/ParcelFileDescriptor;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lo1/e$b$a;

    invoke-direct {v0}, Lo1/e$b$a;-><init>()V

    invoke-direct {p0, v0}, Lo1/e$a;-><init>(Lo1/e$d;)V

    return-void
.end method
